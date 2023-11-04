SELECT custgroup, country, SUM(numberofcustomers) AS numberofcustomers
FROM Sales.PivotCustGroups
UNPIVOT (
    numberofcustomers
    FOR custgroup IN (
        A, B, C
    )
) AS unpivoted
GROUP BY custgroup, country
ORDER BY country;