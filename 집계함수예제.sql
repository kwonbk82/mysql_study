-- 1. 고객 테이블의 도시 컬럼에는 몇 개의 도시가 있는지 계산하여 도시수와
--    중복 값을 제외한 도시수를 출력
SELECT COUNT(DISTINCT 도시) AS 도시수
FROM 고객;

-- 2. 주문 테이블에서 주문년도별로 주문건수를 조회하여 출력
SELECT YEAR(주문일) AS "주문년도", COUNT(*) AS "주문건수"
FROM 주문
GROUP BY YEAR(주문일);

-- 3. 주문 테이블에서 (주문년도, 분기)별 주문건수, 주문년도별 주문건수, 전체 주문건수를 
--    한번에 조회하여 출력
SELECT YEAR(주문일)
,QUARTER(주문일)
,COUNT(*) AS "주문건수"
FROM 주문
GROUP BY YEAR(주문일),QUARTER(주문일)
WITH ROLLUP;

-- 4. 주문 테이블에서 요청일보다 발송일이 늦어진 주문내역이 월별로 몇 건씩인지
--    요약하여 주문월과 주문건수를 조회하되 주문월 순서대로 정렬하여 출력
SELECT MONTH(주문일) AS 주문월
	,COUNT(*) AS 주문건수
FROM 주문
WHERE 요청일<발송일
GROUP BY MONTH(주문일)
ORDER BY MONTH(주문일);
-- 5. 제품 테이블에서 '아이스크림' 제품들에 대하여 제품명별로 재고합계를 출력
SELECT 제품명
		,SUM(재고) AS 재고합계
FROM 제품
WHERE 제품명 LIKE "%아이스크림%" 
GROUP BY 제품명;

-- 6. 고객 테이블에서 마일리지가 50000점 이상인 고객은 'VIP', 나머지는 '일반'으로 구분하고,
--    고객구분별로 고객수와 평균 마일리지를 출력
SELECT IF(마일리지>=50000,'VIP','일반') AS 고객구분
	,COUNT(*) AS 고객수
    ,ROUND(AVG(마일리지),0) AS 평균마일리지
FROM 고객
GROUP BY 고객구분;

-- 1. 제품번호별로 주문수량합계와 주문금액합계 출력
SELECT 제품번호 , SUM(주문수량) AS 주문수량합계 , SUM(주문수량*단가) AS 주문금액합계
FROM 주문세부
GROUP BY 제품번호;
-- 2. 주문번호별로 주문된 제품번호의 목록과 주믄금액합을 출력
SELECT 주문번호, GROUP_CONCAT(제품번호) AS 목록,SUM(주문수량*단가) AS 주문금액합
FROM 주문세부
GROUP BY 주문번호;
-- 3. 2021년 주문내역에 대하여 고객번호별로 주문건수를 출력하되,
--    주문건수가 많은 상위 3건의 고객의 정보만 출력
SELECT 고객번호, COUNT(*) AS 주문건수
FROM 주문
WHERE YEAR(주문일)=2021
GROUP BY 고객번호
ORDER BY 주문건수 DESC
LIMIT 3;

-- 4. 직위별로 사원수와 사원이름목록을 출력
SELECT 직위,COUNT(*) AS 사원수,GROUP_CONCAT(영문이름) AS 사원이름
FROM 사원
GROUP BY 직위;