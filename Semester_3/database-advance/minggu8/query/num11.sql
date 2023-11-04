SELECT country, city, COUNT(custid) AS noofcustomers
FROM Sales.Customers
GROUP BY GROUPING SETS (
    (country, city), (country), (city), ()
);