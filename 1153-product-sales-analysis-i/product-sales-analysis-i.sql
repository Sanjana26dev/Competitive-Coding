# Write your MySQL query statement be
Select p.product_name,s.year,s.price from sales as s left join product as p on s.product_id=p.product_id;