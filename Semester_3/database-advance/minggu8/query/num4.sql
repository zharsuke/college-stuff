SELECT country, city, contactname, [A],[B],[C]
FROM Sales.CustGroups
PIVOT (
    COUNT(custid)
    FOR custgroup IN ([A],[B],[C])
) AS pvt;