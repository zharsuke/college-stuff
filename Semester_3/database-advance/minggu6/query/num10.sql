SELECT
    a.orderyear, curtotalsales, prevtotalsales, (curtotalsales - prevtotalsales) / prevtotalsales * 100 AS percentgrowth
FROM (
    Select YEAR(orderdate) AS orderyear, SUM(val) AS curtotalsales
    FROM Sales.OrderValues
    GROUP BY YEAR(orderdate)
) AS a
LEFT JOIN (
    Select YEAR(orderdate) AS orderyear, SUM(val) AS prevtotalsales
    FROM Sales.OrderValues
    GROUP BY YEAR(orderdate)
) AS b
ON a.orderyear = b.orderyear+1
ORDER BY orderyear ASC;