SELECT custid, orderyear, orderrankno, val
FROM (
    SELECT
    custid, YEAR(orderdate) AS orderyear, RANK() OVER(PARTITION BY custid, YEAR(orderdate) ORDER BY val DESC) AS orderrankno, val
FROM Sales.OrderValues
)
AS ov WHERE orderrankno <= 2;