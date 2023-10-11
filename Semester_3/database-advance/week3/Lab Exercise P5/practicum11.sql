SELECT
    contactname, contacttitle
FROM Sales.Customers
WHERE LEFT(contactname, 1) BETWEEN 'A' AND 'G';