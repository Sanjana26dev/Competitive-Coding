# Write your MySQL query statement below
Select a.id from Weather as a join weather as b ON a.recordDate = DATE_ADD(b.recordDate, INTERVAL 1 DAY)
where a.temperature > b.temperature;