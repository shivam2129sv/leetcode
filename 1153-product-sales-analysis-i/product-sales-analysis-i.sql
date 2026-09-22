# Write your MySQL query statement below
SELECT P.product_name, S.year, S.price
FROM Sales S
inner join Product P on S.product_id = P.product_id;