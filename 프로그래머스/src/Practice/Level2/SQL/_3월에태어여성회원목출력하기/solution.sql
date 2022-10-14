#MySQL
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE MONTH(DATE_OF_BIRTH) = 3
  AND TLNO IS NOT NULL
  AND GENDER = 'W'
ORDER BY MEMBER_ID;

#ORACLE
SELECT MEMBER_ID, MEMBER_NAME, GENDER, TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD') AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE GENDER = 'W'
  AND TLNO IS NOT NULL
  AND EXTRACT(MONTH FROM DATE_OF_BIRTH) = 3
ORDER BY MEMBER_ID;