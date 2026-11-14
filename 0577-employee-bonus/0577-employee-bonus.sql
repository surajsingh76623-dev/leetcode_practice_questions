# Write your MySQL query statement below
select name,bonus from employee
left join bonus
on Employee.empId=bonus.empId
where bonus is null || bonus<1000;