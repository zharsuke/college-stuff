SELECT
    orderid, orderdate, custid, val, RANK() OVER (PARTITION BY custid ORDER BY val DESC) AS orderrankno
FROM Sales.OrderValues;