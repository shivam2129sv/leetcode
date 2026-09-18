# Write your MySQL query statement below
WITH a AS (
    SELECT 
        id,
        num,
        LAG(num, 1) OVER (ORDER BY id) AS prev1,
        LAG(num, 2) OVER (ORDER BY id) AS prev2
    FROM Logs
)
SELECT DISTINCT num AS ConsecutiveNums
FROM a
WHERE num = prev1
  AND num = prev2;
