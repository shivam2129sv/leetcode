# Write your MySQL query statement below
select * from Cinema
where description NOT LIKE 'boring' AND id%2!=0
ORDER BY rating desc;