WITH c2008 AS (
    SELECT
        custid, SUM(val) AS salesamt2008
    FROM Sales.OrderValues
    WHERE year(orderdate) = 2008
    GROUP BY custid
)
SELECT c2.custid, c1.contactname, c2.salesamt2008
FROM Sales.Customers AS c1
JOIN c2008 AS c2 ON c1.custid = c2.custid;