WITH c2008 AS (
    SELECT
        custid, SUM(val) AS salesamt2008
    FROM Sales.OrderValues
    WHERE year(orderdate) = 2008
    GROUP BY custid
), c2007 AS (
    SELECT 
        custid, SUM(val) AS salesamt2007
    FROM Sales.OrderValues
    WHERE year(orderdate) = 2007
    GROUP BY custid
)
SELECT 
    c7.custid, c.contactname, c8.salesamt2008, c7.salesamt2007,
    CASE
        WHEN c7.salesamt2007 IS NULL THEN 0
        WHEN c8.salesamt2008 IS NULL THEN 0
        ELSE (c8.salesamt2008 - c7.salesamt2007) / c7.salesamt2007 * 100
    END AS percentgrowth
FROM Sales.Customers as c
LEFT JOIN c2008 AS c8
ON c8.custid = c.custid
LEFT JOIN c2007 AS c7
ON c7.custid = c.custid
ORDER BY percentgrowth DESC;