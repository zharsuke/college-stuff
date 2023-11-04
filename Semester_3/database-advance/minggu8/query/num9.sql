-- CREATE VIEW Sales.PivotCustGroups AS WITH PivotCustGroups AS (
--     SELECT custid, country, custgroup
--     FROM Sales.CustGroups
-- )

-- SELECT country, p.A, p.B, p.C
-- FROM PivotCustGroups
-- PIVOT (
--     COUNT(custid)
--     FOR custgroup IN (
--         A, B, C
--     )
-- ) AS p;

SELECT country, A, B, C
FROM Sales.PivotCustGroups;