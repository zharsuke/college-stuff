SELECT
    custid,
    'C' + RIGHT('0000' + CONVERT(VARCHAR(10), custid), 10) AS custnewid
FROM Sales.Customers;