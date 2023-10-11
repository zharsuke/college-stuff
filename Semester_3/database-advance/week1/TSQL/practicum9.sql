-- SELECT
--     productid,
--     productname
-- FROM
--     Production.products
-- WHERE
--     categoryid = 4

-- UNION SELECT
--     P.productid,
--     P.productname
-- FROM
--     Production.products P INNER JOIN Sales.OrderDetails OD
-- ON
--     P.productid = OD.productid
-- GROUP BY
--     P.productid, P.productname
-- HAVING
--     SUM(OD.qty * OD.unitprice) > 50000;

-- SELECT
--     productid,
--     productname
-- FROM
--     Production.products
-- WHERE
--     categoryid = 4

-- UNION ALL SELECT
--     P.productid,
--     P.productname
-- FROM
--     Production.products P INNER JOIN Sales.OrderDetails OD
-- ON
--     P.productid = OD.productid
-- GROUP BY
--     P.productid, P.productname
-- HAVING
--     SUM(OD.qty * OD.unitprice) > 50000;

SELECT * 
FROM (SELECT TOP 10
    c.custid, c.companyname, o.orderdate
FROM Sales.Customers AS c
INNER JOIN Sales.Orders AS o
    ON c.custid = o.custid
ORDER BY o.orderdate ASC) AS A1
UNION ALL
SELECT * 
FROM (SELECT TOP 10
    c.custid, c.companyname, o.orderdate
FROM Sales.Customers AS c
INNER JOIN Sales.Orders AS o
    ON c.custid = o.custid
ORDER BY o.orderdate DESC) AS A2;