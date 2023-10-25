SELECT
    custid, orderid, orderdate, val, val / SUM(val) OVER (PARTITION BY custid) * 100 AS percoftotalcust
FROM Sales.OrderValues
ORDER BY custid, orderid DESC;