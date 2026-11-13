# Write your MySQL query statement below
select name as Customers from Customers 
where not exists
(select * from Orders
where Customers.id = Orders.customerId);