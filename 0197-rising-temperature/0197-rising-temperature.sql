# Write your MySQL query statement below
select today.id from Weather today  
left join Weather yesterday
on yesterday.recordDate=DATE_SUB(today.recordDate,INTERVAL 1 DAY)
where today.temperature > yesterday.temperature
