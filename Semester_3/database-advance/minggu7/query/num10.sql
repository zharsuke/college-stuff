WITH SalesMonth2007 AS (
    SELECT 
        MONTH(orderdate) AS monthno, SUM(val) AS val
    FROM Sales.OrderValues
    WHERE YEAR(orderdate) = 2007
    GROUP BY MONTH(orderdate)
)
SELECT monthno, val
FROM SalesMonth2007;