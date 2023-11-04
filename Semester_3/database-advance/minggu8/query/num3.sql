-- ALTER VIEW Sales.CustGroups
-- AS
--     SELECT custid, CHOOSE(custid % 3 + 1, N'A', N'B', N'C') AS custgroup, country, city, contactname
--     FROM Sales.Customers;

SELECT country,[A],[B],[C]
FROM (
    SELECT custid, custgroup, country
    FROM Sales.CustGroups
) AS D
PIVOT (
    COUNT(custid)
    FOR custgroup IN ([A],[B],[C])
) AS pvt;