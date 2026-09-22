# Write your MySQL query statement below
select V.customer_id as customer_id , count(*) as count_no_trans from Visits V
left join Transactions T on V.visit_id = T.visit_id
where T.visit_id IS null 
group by customer_id order by customer_id asc;