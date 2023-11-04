-- CREATE VIEW Sales.CustGroups
-- AS
--     SELECT custid, CHOOSE(custid % 3 + 1, N'A', N'B', N'C') AS custgroup, country
--     FROM Sales.Customers;

SELECT * FROM Sales.CustGroups;