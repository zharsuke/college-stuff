SELECT 
    REPLACE(contactname, ',', '') AS newcontactname,
    RIGHT(contactname, LEN(contactname) - CHARINDEX(',', contactname)) AS firstname
FROM Sales.Customers;
