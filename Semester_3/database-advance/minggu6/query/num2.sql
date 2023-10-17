CREATE VIEW Production.ProductsBeverages AS 
SELECT
    productid, productname, supplierid, unitprice
FROM Production.Products
WHERE categoryid = 1;