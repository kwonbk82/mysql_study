SELECT 사원번호,직위,사원.부서번호,부서명
FROM 사원 INNER JOIN 부서
		ON 사원.부서번호 = 부서.부서번호
WHERE 이름='배재용';

SELECT 고객.고객번호, 담당자명, 고객회사명, COUNT(*) AS 주문건수
FROM 고객 JOIN 주문
		ON 고객.고객번호 = 주문.고객번호
GROUP BY 고객.고객번호, 담당자명, 고객회사명
ORDER BY 주문건수 DESC
LIMIT 10;

SELECT 이름, 직위, 사원.부서번호, 부서명
FROM 사원 JOIN 부서
		ON 사원.부서번호 = 부서.부서번호;

SELECT 고객.고객번호, 담당자명, 고객회사명, 
		SUM(단가*주문수량) AS 주문금액
FROM 고객 JOIN 주문 ON 고객.고객번호=주문.고객번호
        JOIN 주문세부 ON 주문.주문번호=주문세부.주문번호
GROUP BY 고객.고객번호, 담당자명, 고객회사명;

SELECT 고객번호, 고객회사명, 담당자명, 마일리지, 등급명 
FROM 고객 JOIN 마일리지등급 
	ON 마일리지 BETWEEN 하한마일리지 AND 상한마일리지
WHERE 등급명="A";

SELECT 사원번호, 이름, 부서명
FROM 사원 LEFT JOIN 부서 ON 사원.부서번호 = 부서.부서번호 
WHERE 성별="여";

SELECT 부서명, 사원.*
FROM 사원  RIGHT JOIN 부서 ON 사원.부서번호=부서.부서번호;

SELECT 부서명
FROM 사원 RIGHT JOIN 부서 ON 사원.부서번호=부서.부서번호
WHERE 사원.부서번호 IS NULL;

SELECT 이름
FROM 사원 LEFT JOIN 부서 ON 사원.부서번호=부서.부서번호
WHERE 사원.부서번호='';

-- SELF JOIN
SELECT 사원.사원번호
	, 사원.이름
	, 상사.사원번호 AS 상사사원번호
	, 상사.이름 AS 상사이름
FROM 사원 JOIN 사원 AS 상사 ON 상사.사원번호=사원.상사번호;

SELECT 사원.이름 AS 사원명, 사원.직위, 상사.이름 AS 상사명
FROM 사원 LEFT JOIN 사원 AS 상사 ON 상사.사원번호=사원.상사번호
ORDER BY 상사명;

-- 1. 제품명별로 주문수량합과 주문금액합을 출력
SELECT 제품명,SUM(주문수량) AS 주문수량합,SUM(주문수량*주문세부.단가) AS 주문금액합
FROM 제품 JOIN 주문세부 ON 제품.제품번호=주문세부.제품번호
GROUP BY 제품명;

-- 2. '아이스크림' 제품에 대하여 (주문년도 제품명)별로 주문수량 합을 출력
SELECT  YEAR(주문일) AS 주문년도
		,제품명
		,SUM(주문수량) AS 주문수량합
FROM 제품 JOIN 주문세부 ON 제품.제품번호=주문세부.제품번호
		JOIN 주문 ON 주문.주문번호=주문세부.주문번호
WHERE 제품명 LIKE "%아이스크림%"
GROUP BY YEAR(주문일),제품명;

-- 3. 제품명별로 주문수량합을 출력하되 주문이 한 번도 안 된 제품에 대한 정보도 함께 표시하시오.
SELECT 제품명,SUM(주문수량) AS 주문수량합
FROM 제품 LEFT JOIN 주문세부 ON 제품.제품번호=주문세부.제품번호
GROUP BY 제품명;

-- 4. 마일리지 등급이 'A'인 고객의 정보를 조회하여 
--    고객번호, 담당자명, 고객회사명, 등급, 마일리지를 표시하시오 
SELECT 고객번호, 담당자명, 고객회사명, 등급명, 마일리지
FROM 고객 JOIN 마일리지등급 ON 마일리지 BETWEEN 하한마일리지 AND 상한마일리지
WHERE 등급명="A";




