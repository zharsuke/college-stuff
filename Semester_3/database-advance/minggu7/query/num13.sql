SELECT
    custid,
    orderid,
    orderdate,
    val,
    val / SUM(val) OVER (PARTITION BY custid) * 100 AS percoftotalcust,
    SUM(val) OVER (PARTITION BY custid ORDER BY orderdate, orderid) AS runval
FROM Sales.OrderValues
ORDER BY custid, orderdate, orderid;
