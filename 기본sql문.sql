select * 
from 고객;
SELECT 고객번호,마일리지,담당자명
FROM 고객
WHERE 마일리지>=100000;
SELECT *
FROM 주문세부
WHERE 할인율!=0;
SELECT 고객번호,담당자명,고객회사명,마일리지*1.1
FROM 고객;
SELECT 고객번호,담당자명,고객회사명,마일리지 AS 포인트,마일리지*1.1AS '10%인상' 
FROM 고객;
SELECT 고객번호,담당자명,도시,마일리지
FROM 고객
WHERE 도시="서울특별시"
ORDER BY 마일리지 DESC
LIMIT 10;
SELECT DISTINCT 도시
FROM 고객;
SELECT *
FROM 고객
WHERE 담당자직위!="대표 이사";
SELECT 고객번호,담당자명,마일리지,도시
FROM 고객
WHERE 도시="부산광역시" 
UNION
SELECT 고객번호,담당자명,마일리지,도시
FROM 고객
WHERE 마일리지<1000;
SELECT *
FROM 고객
WHERE 지역 IS NULL
ORDER BY 마일리지 DESC;
-- 정보업데이트
COMMIT;
   
UPDATE 고객 
SET 지역=NULL
WHERE 지역='';

SELECT 고객번호,담당자명,담당자직위
FROM 고객
-- WHERE 담당자직위="영업 과장" OR 담당자직위="마케팅 과장" 
WHERE 담당자직위 IN ("영업 과장","마케팅 과장")
ORDER BY 담당자명;
SELECT 고객번호,담당자명,마일리지
FROM 고객
WHERE 마일리지 BETWEEN 100000 AND 200000;
SELECT *
FROM 고객
WHERE 도시 LIKE "%광역시";
SELECT *
FROM 고객
-- 계산순서 AND -> OR  
WHERE 도시 LIKE "%광역시" AND (고객번호 LIKE "__C%" OR 고객번호 LIKE "_C%");
SELECT *
FROM 고객
WHERE 전화번호 LIKE "%45";
SELECT *
FROM 고객 
WHERE 전화번호 LIKE "%45__";
SELECT *
FROM 고객
WHERE 전화번호 LIKE "%45%";
--   1
SELECT *
FROM 고객
WHERE 도시 LIKE "서울%" AND 마일리지 BETWEEN 15000 AND 20000;
-- 2
SELECT DISTINCT 도시,지역
FROM 고객
ORDER BY 지역;
-- 3
SELECT *
FROM 고객
WHERE 도시 IN ("춘천시","과천시","광명시") AND
(담당자직위 LIKE "%이사%" OR 담당자직위 LIKE "%사원%")
ORDER BY 담당자직위, 마일리지 DESC;
-- 4
SELECT *
FROM 고객
WHERE 도시 NOT LIKE "%특별시" OR 도시 NOT LIKE "%광역시"
ORDER BY 마일리지 DESC 
LIMIT 3;
-- 5
SELECT *
FROM 고객
WHERE 지역 LIKE "%";

-- 1
SELECT *
FROM 제품
WHERE 제품명 LIKE "%주스%";
-- 2
SELECT *
FROM 제품
WHERE 제품명 LIKE "%주스%"
		AND 단가 BETWEEN 5000 AND 10000;
-- 3
SELECT *
FROM 제품
WHERE 제품번호 IN (1,2,4,7,11);
-- 4
SELECT 제품번호,제품명,단가,재고,단가*재고 AS 재고금액
FROM 제품
ORDER BY 재고금액 DESC
LIMIT 10;

 






