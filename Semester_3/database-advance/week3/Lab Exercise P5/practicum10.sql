SELECT
    CONCAT(contactname, '(city:', city, ',region:', COALESCE(region, ''), ')') AS fullcontact
FROM Sales.Customers;