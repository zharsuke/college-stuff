WITH PivotCustGroups AS (
    SELECT custid, country, custgroup
    FROM Sales.CustGroups
)

SELECT country, [A],[B],[C]
FROM (
    SELECT custid, custgroup, country
    FROM PivotCustGroups
) AS D

PIVOT (
    COUNT(custid)
    FOR custgroup IN ([A],[B],[C])
) AS pvt;