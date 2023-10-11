-- SELECT
--     custid, companyname, contactname, address, city, country, phone
-- FROM Sales.Customers
-- WHERE
--     country = N'Brazil';

-- SELECT
--     c.custid, c.companyname, o.orderid
-- FROM Sales.Customers AS c
-- LEFT OUTER JOIN Sales.Orders AS o ON c.custid = o.custid and c.city = 'Paris';

-- SELECT
--     custid, companyname, contactname, address, city, country, phone
-- FROM Sales.Customers
-- WHERE country IN('Brazil', 'UK', 'USA');

SELECT
    c.custid, c.companyname, o.orderid
FROM Sales.Customers AS c
LEFT OUTER JOIN Sales.Orders AS o ON c.custid = o.custid OR c.city = 'Paris';