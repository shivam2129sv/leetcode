# Write your MySQL query statement below
with ans as(select requester_id as id from RequestAccepted 
union all
select accepter_id as id from RequestAccepted)
select *,count(*) as num from ans
group by id
order by count(*) desc
limit 1;