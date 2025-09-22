-- 1. 이름에 '정'이 들어가는 담당자명을 검색
SELECT *
FROM 고객
WHERE 담당자명 LIKE "%정%";

-- 2. 2020년 2사분기의 주문내역을 표시
SELECT *
FROM 주문
WHERE YEAR(주문일)=2020 AND QUARTER(주문일)=2;


-- 3. 제품번호, 제품명, 재고, 재고구분을 표시
--  조건) 재고구분 : 재고가 100개 이상이면 '과다재고', 10개 이상이면 '적정', 나머지는 '재고부족'
SELECT 제품번호,제품명,재고,
CASE 
WHEN 재고>=100 THEN "과다재고"
WHEN 재고>=10 THEN "적정"
ELSE "재고부족"
END AS 재고구분
FROM 제품
ORDER BY 재고 DESC;

-- 4. 입사한지 60개월이 지난 사원을 찾아 이름, 부서번호, 직위, 입사일, 입사일수, 입사개월수 출력
SELECT 이름, 부서번호, 직위, 입사일, 
DATEDIFF(CURDATE(), 입사일) AS 입사일수, 
TIMESTAMPDIFF(MONTH,입사일,CURDATE()) AS 입사개월수
FROM 사원
WHERE TIMESTAMPDIFF(MONTH,입사일,CURDATE())>=60;

-- 집계함수
SELECT MAX(마일리지)
FROM 고객
WHERE 도시="서울특별시";

SELECT ROUND(AVG(단가*주문수량),0)
FROM 주문세부;

SELECT 도시,지역,COUNT(*) AS 고객수, ROUND(AVG(마일리지),0)
FROM 고객
GROUP BY 도시,지역;

SELECT 담당자직위, 도시, COUNT(*) AS 고객수,ROUND(AVG(마일리지),0) AS 평균마일리지
FROM 고객
GROUP BY 담당자직위, 도시
ORDER BY 담당자직위, 도시;

SELECT 도시,COUNT(*) AS 고객수,ROUND(AVG(마일리지),0) AS 평균마일리지
FROM 고객
GROUP BY 도시
HAVING COUNT(*)>=10;

SELECT 도시,고객번호,SUM(마일리지)
FROM 고객
WHERE 고객번호 LIKE "T%"
GROUP BY 도시,고객번호
HAVING SUM(마일리지)>=1000;

SELECT 도시,담당자직위,MAX(마일리지) AS 최대마일리지
FROM 고객
WHERE 도시 LIKE "%광역시"
GROUP BY 도시, 담당자직위
HAVING MAX(마일리지)>10000
ORDER BY 담당자직위;

SELECT IFNULL(도시,'전체') AS 도시,COUNT(*) AS 고객수,ROUND(AVG(마일리지),0) AS 평균마일리지
FROM 고객
WHERE 지역 IS NULL
GROUP BY 도시 
WITH ROLLUP;

SELECT 담당자직위, 도시, 지역, COUNT(*) AS 고객수
FROM 고객
WHERE 담당자직위 LIKE "%마케팅%"
GROUP BY 담당자직위, 도시, 지역
WITH ROLLUP;

SELECT 지역, COUNT(*) AS 고객수, GROUPING(지역)
FROM 고객
WHERE 담당자직위 = "대표 이사"
GROUP BY 지역
WITH ROLLUP;

SELECT 도시, GROUP_CONCAT(고객회사명)
FROM 고객
GROUP BY 도시;
