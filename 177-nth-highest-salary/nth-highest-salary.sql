CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      with abcd as (select salary as getNthHighestSalary ,
      dense_rank() over(order by salary desc) as r from Employee) 
      select getNthHighestSalary from abcd where r = N limit 1
      
  );
END