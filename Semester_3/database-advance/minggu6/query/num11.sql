WITH ProductBeverages AS (
    SELECT
        productid, productname, supplierid, unitprice, discontinued,
        CASE WHEN unitprice > 100 THEN N'high' ELSE N'normal'
        END AS price
    FROM Production.Products
    WHERE categoryid = 1
)
SELECT
    productid, productname
FROM ProductBeverages
WHERE price = N'high';