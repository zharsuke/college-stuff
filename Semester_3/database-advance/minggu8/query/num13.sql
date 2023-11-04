SELECT YEAR(orderdate) AS orderyear, MONTH(orderdate) AS ordermonth, DAY(orderdate) AS orderday, SUM(val) AS salesvalue
FROM Sales.OrderValues
GROUP BY ROLLUP (
    YEAR(orderdate),
    MONTH(orderdate),
    DAY(orderdate)
);