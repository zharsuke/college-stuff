SELECT DISTINCT
    od.productid
FROM Sales.OrderDetails AS od
INNER JOIN Sales.Orders AS o ON o.orderid = od.orderid
WHERE YEAR(o.orderdate) = 2007 AND DATEPART(WEEK, o.orderdate) <= 10;