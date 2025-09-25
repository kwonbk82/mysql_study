
-- 1. 제품 테이블에 있는 제품 중 단가가 가장 높은 제품명은 무엇인가?
SELECT 제품명
FROM 제품
WHERE 단가 = (SELECT MAX(단가)
FROM 제품);

-- 2. 제품 테이블에 있는 제품 중 단가가 가장 높은 제품의 주문수량합은 얼마인가?
SELECT SUM(주문수량)
FROM 주문세부
WHERE 제품번호 = (SELECT 제품번호
FROM 제품
WHERE 단가 = (SELECT MAX(단가)
FROM 제품));

-- 3. '아이스크림' 제품의 주문수량합은 얼마인가?
SELECT SUM(주문수량) AS 주문수량합
FROM 주문세부
WHERE 제품번호 IN (SELECT 제품번호 
FROM 제품
WHERE 제품명 LIKE "%아이스크림");

-- 4. '서울특별시' 고객들에 대해 주문년도별 주문건수를 보이시오.
SELECT YEAR(주문일),COUNT(*)
FROM 주문
WHERE 고객번호 IN (SELECT 고객번호 FROM 고객 WHERE 도시='서울특별시')
GROUP BY YEAR(주문일);

-- 1. 제품 테이블에 아래의 레코드를 추가하시오.
-- 제품번호 : 95 / 제품명 : 망고베리 아이스크림 / 포장단위 :  400g / 단가 : 800 / 재고 : 30
-- 제품번호 : 96 / 제품명 :  눈꽃빙수맛 아이스크림 / 단가 : 2000
INSERT INTO 제품(제품번호,제품명,포장단위,단가,재고)
VALUES (95,'망고베리 아이스크림','400g',800,30),
(96,'눈꽃빙수맛 아이스크림',NULL,2000,NULL);

-- 2. 96번 제품의 재고를 30으로 변경하시오
UPDATE 제품
SET 재고=100
WHERE 제품번호=96;

-- 3. 사원이 한 명도 존재하지 않는 부서를 부서 테이블에서 삭제하시오.
DELETE 부서
FROM 부서 LEFT JOIN 사원 ON 부서.부서번호=사원.부서번호
WHERE 사원.부서번호 IS NULL;


-- 1. 고객 테이블에 새로운 레코드를 삽입하시오.
--    고객번호 : ZZZAA / 담당자명 : 한동욱 / 고객회사명 : 자유트레이딩 / 도시 : 서울특별시
INSERT INTO 고객(고객번호,담당자명,고객회사명,도시)
VALUES ('ZZZAA','한동훈','자유트레이딩','서울특별시');

-- 2. 고객번호 'ZZZAA' 고객의 레코드에 대해 컬럼 값을 아래와 같이 변경하시오.
--     도시 : 부산광역시 / 마일리지 : 100 / 담당자직위: 대표이사
UPDATE 고객
SET 도시='부산광역시',마일리지=100,담당자직위='대표이사'
WHERE 고객번호='ZZZAA';

-- 3. 'ZZZAA' 고객의 레코드에 대해 마일리지를 
--    '대표 이사' 직위의 평균 마일리지 값으로 변경하시오
UPDATE 고객
SET 마일리지 = (SELECT AVG(마일리지)
FROM 고객
WHERE 담당자직위='대표이사')
WHERE 고객번호='ZZZAA';

-- 4. 사원번호 'E15'의 레코드가 없으면 레코드를 새로 삽입하고,
--    레코드가 있다면 데이터 값을 수정하시오.
--    사원번호 : E15 / 이름 : 이석진 / 직위 : 수습사원
INSERT INTO 사원(사원번호,이름,직위)
VALUES ('E15','이석진','수습사원')
ON DUPLICATE KEY UPDATE
사원번호='E15',이름='이석진',직위='수습사원';


-- 5. 'ZZZAA'고객의 레코드를 삭제하시오.
DELETE FROM 고객
WHERE 고객번호='ZZZAA'; 

-- 6. 'E15'사원의 레코드를 삭제하시오.
DELETE FROM 사원
WHERE 사원번호='E15'; 


-- DDL
CREATE DATABASE MACADEMY;
USE MACADEMY;

CREATE TABLE 과정(
	수업번호 CHAR(2),
    수업명 VARCHAR(20) NOT NULL,
    강사명 VARCHAR(20),
    PRIMARY KEY(수업번호)
);
INSERT INTO 과정
VALUES ('AA','풀스택개발자과정','이수정'),
		('BB','프론트개발자과정','김진미'),
        ('CC','일본개발자과정','시즈쿠');

CREATE TABLE 학생(
	아이디 INT AUTO_INCREMENT,
	학번 CHAR(5) PRIMARY KEY,
    이름 VARCHAR(20) NOT NULL,
    생일 DATE,
    등록일 DATE DEFAULT(CURDATE()),
    연락처 VARCHAR(20) UNIQUE,
    수업번호 CHAR(2) REFERENCES 수업(수업번호),
    키 INT,
	몸무게 INT,
    성별 CHAR(1) CHECK(성별 IN ('M','F')),
    체질량지수 DECIMAL(4,1) AS (몸무게/POWER(키/100,2)) STORED
    -- FOREIGN KEY (수업번호) REFERENCES 수업(수업번호)
);

INSERT INTO 학생
VALUES ('S0001','백승원','1998-09-24','01011111111','CC',0),
('S0002','차승원','1989-09-24',NULL,'AA',1),
('S0002','이승원','1989-02-24',NULL,'AA',1),
('S0003','고승원','1978-09-24','01011133111','DD',0);

DELETE FROM 학생 WHERE 성별 IS NULL;

CREATE TABLE 휴학생 AS 
	SELECT * FROM 학생 WHERE 1=2;
    
ALTER TABLE 학생 ADD COLUMN 성별 CHAR(1);    
ALTER TABLE 학생 MODIFY COLUMN 성별 VARCHAR(3); 

ALTER TABLE 학생 CHANGE COLUMN 연락처 휴대폰번호 VARCHAR(20); 
ALTER TABLE 학생 DROP COLUMN 성별; 
ALTER TABLE 학생 RENAME STUDENT; 
        
SELECT * FROM 과정;

-- 1. 제품 테이블의 재고 컬럼에 CHECK 제약조건을 추가하시오.
--    제약조건 : 재고는 0보다 크거나 같아야 함

ALTER TABLE 제품 ADD CHECK (재고>0);

-- 2. 제품 테이블에 재고금액 컬럼을 추가하시오.
--    이때 재고금액은 '단가*재고'가 자동 계산되어 저장되도록 설정할 것
ALTER TABLE 제품 ADD COLUMN 재고금액 INT AS (단가*재고) STORED;

-- 3. 제품 테이블에서 제품 레코드를 삭제하면 주문세부 테이블에 있는 관련 레코드도
--    함께 삭제되도록 주문세부 테이블의 제품번호 컬럼에 외래키 제약조건과 옵션을 설정하시오
ALTER TABLE 주문세부 ADD FOREIGN KEY (제품번호) REFERENCES 제품(제품번호) ON DELETE CASCADE;

-- 1. 다음의 테이블 명세서를 참고하여 영화 테이블을 생성하시오.
-- 	컬럼명		데이터타입		제약조건
-- 	영화번호		고정문자형 5자		기본키
-- 	타이틀		가변문자형 100자		필수입력
-- 	장르		가변문자형 20자		코미디,드라마,다큐,SF,액션,역사,기타만 입력가능
-- 	배우		가변문자형 100자		필수입력
--	감독		가변문자형 50자		필수입력
--	제작사		가변문자형 50자		필수입력
-- 	개봉일		날짜형
-- 	등록일		날짜형			오늘날짜 자동 입력

CREATE TABLE 영화(
	영화번호 CHAR(5) PRIMARY KEY,
    타이틀 VARCHAR(100) NOT NULL,
    장르 VARCHAR(20) CHECK(장르 IN ('코미디','드라마','다큐','SF','액션','역사','기타')),
    배우 VARCHAR(100) NOT NULL,
	감독 VARCHAR(50) NOT NULL,
    제작사 VARCHAR(50) NOT NULL,
    개봉일 DATE,
    등록일 DATE DEFAULT(CURDATE())
);



-- 2. 평점관리 테이블을 생성하시오.
-- 	컬럼명		데이터타입		제약조건
-- 	번호		숫자형			일련번호 자동 입력, 기본키
--	평가자닉네임	가변문자형 50자		필수입력
--	영화번호		고정문자형 5자		필수입력, 영화테이블의 영화번호 참조
-- 	평점		숫자형			1~5사이의 값만 입력. 필수입력
-- 	평가		가변문자형 2000자		필수입력
--	등록일		날짜형			오늘 날짜 자동 입력        

CREATE TABLE 평점관리(
	번호 INT AUTO_INCREMENT,
    평가자닉네임 VARCHAR(50) NOT NULL,
    영화번호 CHAR(5) NOT NULL REFERENCES 영화(영화번호),
    평점 INT  NOT NULL CHECK(평점 BETWEEN 1 AND 5),
    평가 VARCHAR(2000) NOT NULL,
    등록일 DATE DEFAULT(CURDATE()),
    PRIMARY KEY(번호)
);

