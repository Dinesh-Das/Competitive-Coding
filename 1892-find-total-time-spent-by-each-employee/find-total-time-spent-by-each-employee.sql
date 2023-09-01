/* Write your PL/SQL query statement below */
SELECT 
TO_CHAR(event_day, 'YYYY-MM-DD') AS "day", 
emp_id, 
SUM(out_time) - SUM(in_time) AS "total_time" 
FROM employees 
GROUP BY event_day, emp_id 
ORDER BY "total_time" DESC;