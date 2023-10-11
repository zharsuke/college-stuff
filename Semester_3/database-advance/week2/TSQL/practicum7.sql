SELECT
    productname, unitprice
FROM Production.Products
ORDER BY unitprice DESC
OFFSET 0 ROWS
FETCH NEXT 8 ROWS ONLY;