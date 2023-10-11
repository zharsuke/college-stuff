SELECT
    isitdate,
    TRY_CAST(isitdate AS date) AS coverteddate
FROM Sales.Somedates;