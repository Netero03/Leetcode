# Write your MySQL query statement below
select s.user_id,round(IFNULL(SUM(action="confirmed")/count(action),0.00),2) as confirmation_rate
from Signups s
left join Confirmations c 
on s.user_id=c.user_id
group by s.user_id