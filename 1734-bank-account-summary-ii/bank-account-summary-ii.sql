# Write your MySQL query statement below
select users.name as name, 
sum(Transactions.amount ) as balance
from Users
left join Transactions on Transactions.account = Users.account 
group by Transactions.account
having sum(Transactions.amount )> 10000;