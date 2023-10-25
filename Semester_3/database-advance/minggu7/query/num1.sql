SELECT
    orderid, orderdate, val, ROW_NUMBER() OVER(ORDER BY orderdate) AS rowno
FROM Sales.OrderValues;