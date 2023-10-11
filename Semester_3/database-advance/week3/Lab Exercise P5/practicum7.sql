SELECT
    orderid, custid, CONVERT(DATE, orderdate) AS orderdate
FROM Sales.Orders
WHERE DAY(orderdate) > DAY(DATEADD(DAY, -5, EOMONTH(orderdate)));