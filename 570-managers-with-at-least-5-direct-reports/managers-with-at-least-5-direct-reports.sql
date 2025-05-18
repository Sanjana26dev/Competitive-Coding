# Write your MySQL query statement below
Select e.name from employee as e inner join employee as m on e.id= m.managerId group by m.managerId having count(m.managerId)>=5;