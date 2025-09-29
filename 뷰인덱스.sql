CREATE OR REPLACE VIEW view_사원 
AS 
SELECT 이름,집전화,입사일,주소 FROM 사원;
SELECT *  FROM view_사원;

CREATE OR REPLACE VIEW view_예제
AS
SELECT 제품명, SUM(주문수량) AS 주문수량합
FROM 제품 JOIN 주문세부 ON 제품.제품번호=주문세부.제품번호
GROUP BY 제품명;


CREATE OR REPLACE VIEW view_여직원
AS
SELECT 이름, 집전화 AS 비상연락망,입사일,주소,성별
FROM 사원
WHERE 성별="여"
WITH CHECK OPTION;
SELECT *  FROM 고객;

SELECT 이름, 비상연락망,입사일,주소,성별
FROM view_여직원
WHERE 비상연락망 LIKE "%88%";

DROP VIEW view_사원;
DESC 고객;
SELECT *  FROM 제품;

CREATE TABLE 원생(
	아이디 INT AUTO_INCREMENT,
	학번 CHAR(5) ,
    이름 VARCHAR(20) NOT NULL,
    생일 DATE,
    등록일 DATE DEFAULT(CURDATE()),
    키 INT,
	몸무게 INT,
    성별 CHAR(1) CHECK(성별 IN ('M','F')),
    체질량지수 DECIMAL(4,1) AS (몸무게/POWER(키/100,2)) STORED,
    PRIMARY KEY(아이디,학번,이름),
    INDEX 등록일인덱스(등록일),
    INDEX 이름인덱스(이름)
);
-- SHOW INDEX FROM ;

DELIMITER $$
CREATE PROCEDURE proc_if()
	BEGIN 
		DECLARE x INT;
		DECLARE y INT DEFAULT 5;
        SET x=10;
		IF x>y THEN 
			SELECT 'x는y보다 큽니다.' AS 결과;
		ELSE 
			SELECT 'x는y보다 작읍니다.' AS 결과;
		END IF;
    END $$
DELIMITER ;
CALL proc_if();
    DELIMITER $$
CREATE PROCEDURE proc_고객정보()
	BEGIN 
    SELECT * FROM 고객;
    SELECT COUNT(*) AS 고객수 FROM 고객;
    END $$
    DELIMITER ;
    
ALTER TABLE 고객 MODIFY COLUMN 고객회사명 VARCHAR(20) COLLATE utf8mb4_general_ci;
CALL proc_고객정보();

    DELIMITER $$
CREATE PROCEDURE proc_도시고객정보(	IN city VARCHAR(50) )
	BEGIN
    SELECT * FROM 고객 WHERE 도시=city;
    SELECT COUNT(*) AS 고객수 FROM 고객 WHERE 도시=city;
    END $$
    DELIMITER ;
    
    CALL proc_도시고객정보('대전광역시');
    
DELIMITER $$
CREATE PROCEDURE proc_주문년도와고객정(IN city VARCHAR(50) , IN nen INT )
	BEGIN
    SELECT 고객.고객번호, 고객회사명, 도시, COUNT(*) AS 주문건수
    FROM 고객 JOIN 주문 ON 고객.고객번호=주문.고객번호
    WHERE YEAR(주문일)=nen AND 도시=city
    GROUP BY 고객.고객번호, 고객회사명, 도시;
    END $$
    DELIMITER ; 
    
    CALL proc_주문년도와고객정('부산광역시',2021);
    
DELIMITER $$
CREATE PROCEDURE proc_고객회사명과마일리지추가수정(IN company VARCHAR(50) , IN mileplus INT )
	BEGIN
    SELECT 고객번호,고객회사명,마일리지 AS 변경전마일리지
    FROM 고객 
    WHERE 고객회사명=company;
    UPDATE 고객 
    SET 마일리지=마일리지+mileplus
    WHERE 고객회사명=company; 
        SELECT 고객번호,고객회사명,마일리지 AS 변경후마일리지
    FROM 고객 
    WHERE 고객회사명=company;
    END $$
    DELIMITER ; 
    SELECT *  FROM 고객;
    CALL proc_고객회사명과마일리지추가수정('굿모닝서울',10000);
    
    DELIMITER $$
CREATE PROCEDURE proc_고객회사명과마일리지변경(IN company VARCHAR(50))
	BEGIN
		DECLARE 평균마일리지 INT;
        DECLARE 보유마일리지 INT;
		SELECT 고객회사명, 마일리지 AS 변경전마일리지
		FROM 고객
        WHERE 고객회사명=company;
        SET 평균마일리지 = (SELECT AVG (마일리지) FROM 고객);
        SET 보유마일리지 = (SELECT 마일리지 FROM 고객 WHERE 고객회사명=company);
        IF (보유마일리지>평균마일리지) THEN 
        UPDATE 고객 
		SET 마일리지 = 마일리지 +100
        WHERE 고객회사명=company;
        ELSE 
        UPDATE 고객 
		SET 마일리지 = 평균마일리지
        WHERE 고객회사명=company;
        END IF;
        SELECT 고객회사명, 마일리지 AS 변경후마일리지
        FROM 고객
        WHERE 고객회사명=company;
    END $$
    DELIMITER ; 
    
CALL proc_고객회사명과마일리지변경('엘케이 상사');

CREATE TABLE 제품로그(
	로그번호 INT AUTO_INCREMENT PRIMARY KEY,
    처리 VARCHAR(10),
    내용 VARCHAR(100),
    처리일 TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER $$
CREATE TRIGGER tri_제품추가로그
AFTER INSERT ON 제품
FOR EACH ROW
	BEGIN
		INSERT INTO 제품로그(처리,내용)
        VALUES('INSERT',CONCAT('제품번호:', NEW.제품번호,'제품명:',NEW.제품명));
    END $$
    DELIMITER ; 
INSERT INTO 제품(제품번호,제품명,단가,재고)
VALUES (99,'사탕',2000,10);

DELIMITER $$
CREATE TRIGGER tri_제품삭제로그
AFTER DELETE ON 제품
FOR EACH ROW
	BEGIN
		INSERT INTO 제품로그(처리,내용)
        VALUES('DELETE',CONCAT('제품번호:', OLD.제품번호,'제품명:',OLD.제품명));
    END $$
    DELIMITER ; 
DELETE FROM 제품
WHERE 제품번호=99;
SELECT * FROM 제품로그;