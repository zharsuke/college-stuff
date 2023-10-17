SELECT
    custid, SUM(totalsalesamount) AS total_sales_amount, AVG(totalsalesamount) AS avg_sales_amount
FROM (
    SELECT
    o.custid, o.orderid, SUM(qty * unitprice) AS totalsalesamount
    FROM Sales.Orders AS o
    INNER JOIN Sales.OrderDetails od ON o.orderid = od.orderid
    GROUP BY custid, o.orderid
) AS p
GROUP BY custid;