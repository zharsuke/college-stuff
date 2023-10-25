SELECT
    custid, val, YEAR(orderdate) AS orderyear, RANK() OVER(PARTITION BY custid, YEAR(orderdate) ORDER BY val DESC) AS orderrankno
FROM Sales.OrderValues;