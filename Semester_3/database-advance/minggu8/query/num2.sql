SELECT country,[A],[B],[C]
FROM (
    SELECT custid, custgroup, country
    FROM Sales.CustGroups
) AS D
PIVOT (
    COUNT(custid)
    FOR custgroup IN ([A],[B],[C])
) AS pvt;