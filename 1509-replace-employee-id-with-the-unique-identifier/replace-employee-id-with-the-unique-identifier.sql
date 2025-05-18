# Write your MySQL query statement below
Select eu.unique_id, e.name from employees as e Left join employeeuni as eu on eu.id=e.id;