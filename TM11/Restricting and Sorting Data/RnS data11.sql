SELECT EMPLOYEE_ID, LAST_NAME, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE manager_id = &MANAGER_ID
ORDER BY &SORTED_BY