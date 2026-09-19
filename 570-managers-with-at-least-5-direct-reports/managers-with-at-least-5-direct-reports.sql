SELECT m.name
FROM Employee m
JOIN (
    SELECT managerId
    FROM Employee
    WHERE managerId IS NOT NULL
    GROUP BY managerId
    HAVING COUNT(*) >= 5
) e
ON m.id = e.managerId;