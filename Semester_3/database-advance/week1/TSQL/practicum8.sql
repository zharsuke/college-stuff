-- SELECT TOP 20
--     custid, orderid, orderdate
-- FROM Sales.Orders
-- ORDER BY orderid ASC, orderdate ASC;

SELECT
    custid, orderid, orderdate
FROM Sales.Orders
ORDER BY orderid ASC, orderdate ASC
OFFSET 20 ROWS
FETCH NEXT 20 ROWS ONLY;