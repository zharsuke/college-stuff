SELECT p.productid, p.productname 
FROM(
    SELECT
        productid, productname, supplierid, unitprice, discontinued,
        CASE WHEN unitprice > 100. THEN N'high' ELSE N'normal' 
        END AS price
    FROM Production.Products
    WHERE categoryid = 1
) AS p
WHERE p.price = N'high';