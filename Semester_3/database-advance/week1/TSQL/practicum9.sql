-- SELECT
--     productid,
--     productname
-- FROM
--     Production.products
-- WHERE
--     categoryid = 4;

SELECT
    P.productid,
    P.productname
FROM
    Production.products P INNER JOIN Sales.OrderDetails OD
ON
    P.productid = OD.productid
GROUP BY
    P.productid, P.productname
HAVING
    SUM(OD.qty * OD.unitprice) > 50000;