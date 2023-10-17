-- ALTER VIEW Production.ProductsBeverages AS
-- SELECT
-- productid, productname, supplierid, unitprice, discontinued,
-- CASE WHEN unitprice > 100. THEN N'high' ELSE N'normal' END AS price
-- FROM Production.Products
-- WHERE categoryid = 1;

-- SELECT
--     productid,
--     productname,
--     supplierid,
--     unitprice,
--     discontinued,
--     price
-- FROM Production.ProductsBeverages;

IF OBJECT_ID(N'Production.ProductsBeverages', N'V') IS NOT NULL
DROP VIEW Production.ProductsBeverages;