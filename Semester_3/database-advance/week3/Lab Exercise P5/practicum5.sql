SELECT
    custid, CONVERT(DATE, orderdate) AS orderdate
FROM Sales.Orders
WHERE orderdate >= '2008-01-01' AND orderdate <= '2008-02-29';