ALTER VIEW Production.ProductsBeverages AS
SELECT
    productid, productname, supplierid, unitprice, discountinued
FROM Production.Products
WHERE categoryid = 1
ORDER BY productname;