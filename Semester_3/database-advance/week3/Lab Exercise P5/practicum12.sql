SELECT
    REPLACE(contactname, ',', '') AS contactname,
    SUBSTRING(contactname, 1, CHARINDEX(',', contactname) -1) AS lastname
FROM Sales.Customers;