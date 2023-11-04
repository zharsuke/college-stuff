WITH SalesByCategory AS (
    SELECT o.custid, SUM(od.unitprice * od.qty) AS SalesValue, categoryname
    FROM Sales.Orders AS o
    JOIN Sales.OrderDetails AS od ON o.orderid = od.orderid
    JOIN Production.Products AS p ON od.productid = p.productid
    JOIN Production.Categories AS c ON p.categoryid = c.categoryid
    WHERE YEAR(o.orderdate) = 2008
    GROUP BY o.custid, categoryname
)

SELECT custid, [Beverages], [Condiments], [Confections], [Dairy Products], [Grains/Cereals], [Meat/Poultry], [Produce], [Seafood]
FROM (
    SELECT * FROM SalesByCategory
) AS p

PIVOT (
    SUM(SalesValue)
    FOR categoryname IN ([Beverages], [Condiments], [Confections], [Dairy Products], [Grains/Cereals], [Meat/Poultry], [Produce], [Seafood])
) AS pvt;