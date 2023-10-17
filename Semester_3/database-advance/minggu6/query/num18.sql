SELECT TOP (3)
    p.productid, MAX(productname) AS productname, SUM(od.qty * od.unitprice) AS totalsalesamount
FROM Sales.OrderDetails AS od
INNER JOIN Sales.Orders AS o ON od.orderid = o.orderid
INNER JOIN Production.Products AS p ON od.productid = p.productid
WHERE custid = 1
GROUP BY p.productid
ORDER BY totalsalesamount DESC;