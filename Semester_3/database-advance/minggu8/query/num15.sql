SELECT GROUPING_ID(YEAR(orderdate), MONTH(orderdate)) AS groupid, YEAR(orderdate) AS orderyear, MONTH(orderdate) AS ordermonth, SUM(val) AS salesvalue
FROM Sales.OrderValues
GROUP BY ROLLUP (
    YEAR(orderdate),
    MONTH(orderdate)
)
ORDER BY groupid, orderyear, ordermonth;