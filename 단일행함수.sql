
-- 문자의 개수
SELECT char_length('영장류 GOAT'), length('영장류 GOAT')
FROM DUAL;

SELECT CONCAT_WS('-','010','3415','8768');
SELECT CONCAT('K-POP','MODEL','MACHINE');
SELECT CONCAT_WS(' ','K-POP','MODEL','MACHINE');

SELECT SUBSTR("ABCDEFG",4,3);
SELECT substring_index('부산광역시 부산진구 부전대로 86'," ",-3);

SELECT LPAD('MYSQL',10,"*");
SELECT RPAD('MYSQL',10,"*");
SELECT LTRIM('           MYSQL            ');
SELECT RTRIM('           MYSQL            ');
SELECT TRIM('           MYSQL            ');
SELECT TRIM(BOTH 'ABC' FROM 'ABCABCABCMYSQLABCABC');
SELECT TRIM(LEADING 'ABC' FROM 'ABCABCABCMYSQLABCABC');
SELECT TRIM(TRAILING 'ABC' FROM 'ABCABCABCMYSQLABCABC');

SELECT FIND_IN_SET('B','A, B,C');
SELECT LOCATE('B','A,B,C');
SELECT INSTR('A,B,C','B');

SELECT REPEAT('#',5);
SELECT REPLACE('010.2132.4231','.','-');

SELECT ROUND(123.567,2);

SELECT NOW(),SYSDATE(),CURDATE(),CURTIME();
SELECT QUARTER(NOW());

SELECT DATEDIFF('2025-12-7',NOW());

SELECT ADDDATE(NOW(),INTERVAL 100 DAY);

SELECT WEEKDAY('2025-09-15');

SELECT CAST(2 AS CHAR);

SELECT IF(1>2,'정답','오답');

SELECT 
	CASE WHEN 12340*57>5000000 THEN '초과달성'
		WHEN 12340*57>4000000 THEN '달성'
        ELSE '미달'
	END AS 달성여부;

-- 1 
SELECT 고객회사명, CONCAT('**', SUBSTR(고객회사명, 3)) AS 고객회사명2,
	전화번호,REPLACE(SUBSTR(전화번호,2),')','-') AS 전화번호2
FROM 고객;

-- 2
SELECT *,
	ROUND(주문수량*단가,-1) AS 주문금액, ROUND(주문수량*단가*할인율,-1) AS 할인금액, ROUND((주문수량*단가)-(주문수량*단가*할인율),-1) AS 실주문금액
FROM 주문세부
WHERE 할인율 != 0;

-- 3
SELECT 이름,
	생일,timestampdiff(YEAR,생일,CURDATE()) AS "만 나이",
    입사일,datediff(CURDATE(),입사일) AS 입사일수,ADDDATE(입사일,1000) AS "입사 1000일"
FROM 사원;

-- 4 
SELECT 담당자명, 고객회사명, 도시, 
	IF(도시 LIKE "%특별시" OR 도시 LIKE "%광역시",'대도시','도시') AS '도시구분',
	마일리지,
    CASE WHEN 마일리지>=100000 THEN 'VVIP'
		WHEN 마일리지>=10000 THEN 'VIP'
        ELSE '일반고객'
	END AS '마일리지 구분'
FROM 고객;

-- 5 
SELECT 주문번호,고객번호 ,주문일,
	YEAR(주문일) AS 주문년도,quarter(주문일) AS 주문분기,month(주문일) AS 주문한달,DAY(주문일) AS 주문일자,WEEKDAY(주문일) AS 주문요일,
    CASE WEEKDAY(주문일)
		WHEN 0 THEN '월요일'
        WHEN 1 THEN '화요일'
        WHEN 2 THEN '수요일'
        WHEN 3 THEN '목요일'
        WHEN 4 THEN '금요일'
        WHEN 5 THEN '토요일'
        WHEN 6 THEN '일요일'
        END AS 한글요일
FROM 주문
LIMIT 100; 

-- 6
SELECT *,DATEDIFF(발송일,요청일) AS 지연일수
FROM 주문
WHERE DATEDIFF(발송일,요청일)>7;




 