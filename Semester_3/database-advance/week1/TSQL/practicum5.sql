-- SELECT
--     c.contactname, c.contacttitle
-- FROM Sales.Customers as c;

SELECT
    c.contactname AS Name, c.contacttitle AS Title, c.companyname as [Company Name]
FROM Sales.Customers as c;