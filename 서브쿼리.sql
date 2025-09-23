-- 1. 마일리지 등급명별로 고객수를 출력
SELECT 등급명, COUNT(*) AS 고객수
FROM 고객 JOIN 마일리지등급 ON 마일리지 BETWEEN 하한마일리지 AND 상한마일리지
GROUP BY 등급명;
-- 2. 주문번호 'H0249'를 주문한 고객의 모든 정보 출력
SELECT 고객.*
FROM 고객 JOIN 주문 ON 고객.고객번호=주문.고객번호
WHERE 주문번호 ='H0249';

-- 3. 2020년 4월 9일에 주문한 고객의 모든 정보 출력
SELECT 고객.*
FROM 고객 JOIN 주문 ON 고객.고객번호=주문.고객번호
WHERE 주문일 ='2020-04-09';

-- 4. 도시별로 주문금액합을 출력하되
--    주문금액합이 많은 상위 5개의 도시에 대한 결과만 출력
SELECT 도시, SUM(주문수량*단가) AS 주문금액합
FROM 고객 JOIN 주문 ON 고객.고객번호=주문.고객번호
		JOIN 주문세부 ON 주문세부.주문번호=주문.주문번호
GROUP BY 도시
ORDER BY SUM(주문수량*단가) DESC
LIMIT 5;

-- 서브쿼리
SELECT *
FROM 고객
WHERE 마일리지 = (SELECT MAX(마일리지) FROM 고객);

SELECT 고객회사명, 담당자명
FROM 고객
WHERE 고객번호 =(SELECT 고객번호 FROM 주문 WHERE 주문번호='H0250');

SELECT *
FROM 사원
WHERE 사원번호 =(SELECT 사원번호
				FROM 주문
				WHERE 주문번호 ='H0250');

SELECT *
FROM 고객 
WHERE 마일리지 > (SELECT MIN(마일리지)
				FROM 고객
				WHERE 도시='부산광역시');
                
SELECT COUNT(*)
FROM 주문
WHERE 고객번호 IN (SELECT 고객번호
FROM 고객
WHERE 도시="부산광역시");    

SELECT *
FROM 고객 
WHERE 마일리지 >ALL (SELECT 마일리지
				FROM 고객
				WHERE 도시='부산광역시');  
                
SELECT *
FROM 고객 
WHERE EXISTS (SELECT 고객번호
FROM 주문 
WHERE 고객번호=고객.고객번호);     

WITH 도시별마일리지 AS (
SELECT 도시, ROUND(AVG(마일리지),0) AS 도시별평균마일리지
FROM 고객
GROUP BY 도시)
SELECT 담당자명,고객회사명,마일리지,고객.도시
,도시별평균마일리지
,도시별평균마일리지-마일리지 
FROM 고객, 도시별마일리지
WHERE 고객.도시=도시별마일리지.도시;		

SELECT 고객번호,담당자명
,(SELECT MAX(주문일) FROM 주문 WHERE 주문.고객번호=고객.고객번호) AS 최종주문일
FROM 고객;

SELECT 도시, AVG(마일리지)
FROM 고객 
GROUP BY 도시
HAVING AVG(마일리지) >(SELECT AVG(마일리지) FROM 고객);

SELECT 사원번호 
		,사원.이름 
		,(SELECT 이름 FROM 사원 AS 상사 WHERE 상사.사원번호=사원.사원번호) 
FROM 사원;        

SELECT 도시
		,담당자명
        ,고객회사명
        ,마일리지
FROM 고객
WHERE (도시,마일리지) IN (SELECT 도시,MAX(마일리지) FROM 고객 GROUP BY 도시);


-- 서브쿼리로 풀어보시고 가능하시면 같은 문제를 JOIN으로도 해보세요!

-- 1. '배재용' 사원의 부서명을 출력하시오
-- 출력하고자 하는것을 먼저 적기
SELECT 부서명 
FROM 부서
WHERE 부서번호 = (SELECT 부서번호 FROM 사원 WHERE 이름='배재용');

SELECT (SELECT 부서명 
FROM 부서
WHERE 부서.부서번호=사원.부서번호)
FROM 사원
WHERE 이름 = '배재용';

-- 2. 한 번도 주문한 적이 없는 제품의 정보를 출력하시오.
SELECT *
FROM 제품
WHERE NOT EXISTS (SELECT *
FROM 주문세부
WHERE 주문세부.제품번호=제품.제품번호);

-- 3. 담당자명, 고객회사명, 주문건수, 최초주문일과 최종주문일을 출력하시오.
WITH 주문정보 AS(
SELECT 고객번호
,COUNT(*) AS 주문건수
,MIN(주문일) AS 최초주문일
,MAX(주문일) AS 최종주문일
FROM 주문 
GROUP BY 고객번호)


SELECT 담당자명 , 고객회사명, 주문건수, 최초주문일, 최종주문일
FROM 고객, 
SELECT 고객번호
,COUNT(*) AS 주문건수
,MIN(주문일) AS 최초주문일
,MAX(주문일) AS 최종주문일
FROM 주문 
GROUP BY 고객번호)
WHERE 고객.고객번호=주문정보.고객번호;

-- CRUD
INSERT INTO 부서(부서번호,부서명)
VALUES ('A5','마케팅부');

INSERT INTO 제품
VALUES (92,'게살버거',NULL,5000,40);

INSERT INTO 사원(사원번호,이름,직위,성별,입사일)
VALUES ('E20','강해린','수습사원','여',curdate())
,('E21','장원영','수습사원','여',curdate())
,('E22','유지민','수습사원','여',curdate());

UPDATE 사원 
SET 이름='장원영'
WHERE 사원번호='E21';

UPDATE 제품
SET 단가=단가*1.1,재고=재고-10
WHERE 제품번호=91;

DELETE FROM 제품
WHERE 제품번호=91;

DELETE FROM 사원
ORDER BY 입사일 DESC
LIMIT 3;

SELECT * FROM 제품 WHERE 제품번호=91;

INSERT INTO 제품
VALUES (92,'게살버거',NULL,5000,40)
ON DUPLICATE KEY UPDATE 제품명="만능연어장";

SELECT * FROM 제품 ORDER BY 제품번호 DESC;

CREATE TABLE 고객주문요약(
	고객번호 CHAR(5) PRIMARY KEY,
	고객회사명 VARCHAR(50),
	주문건수 INT,
	최종주문일 DATE
);

SELECT 고객.고객번호,고객회사명,COUNT(*) AS 주문건수, MAX(주문일) AS 최종주문일
FROM 고객 JOIN 주문 ON 고객.고객번호=주문.고객번호
GROUP BY 고객번호,고객회사명;

UPDATE 제품
SET 단가= (SELECT * FROM (SELECT AVG(단가)
FROM 제품 
WHERE 제품명 LIKE "%소스%") AS 평균)
WHERE 제품번호=91;

UPDATE 고객,(SELECT 고객번호
FROM 주문) AS 주문고객
SET 마일리지=마일리지*1.1 
WHERE 고객.고객번호 IN (주문고객.고객번호);

UPDATE 고객 JOIN 마일리지등급 ON 마일리지 BETWEEN 하한마일리지 AND 상한마일리지
SET 마일리지=마일리지+1000
WHERE 등급명='S';

DELETE FROM 주문
WHERE 주문번호 NOT IN (SELECT 주문번호 FROM 주문세부);

DELETE 주문, 주문세부
FROM 주문 JOIN 주문세부 ON 주문.주문번호=주문세부.주문번호
WHERE 주문.주문번호='H0248';

DELETE 고객
FROM 고객 LEFT JOIN 주문 ON 고객.고객번호=주문.고객번호
WHERE 주문.고객번호 IS NULL;

SELECT * FROM 고객 WHERE 담당자명='황수영';



