SELECT LAST_NAME, JOB_ID, HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Matos' OR LAST_NAME = 'Taylor'
ORDER BY HIRE_DATE;