SELECT
    orderid, orderdate, val, ROW_NUMBER() OVER(ORDER BY orderdate) AS rowno, RANK() OVER(ORDER BY orderdate ASC) AS rankno
FROM Sales.OrderValues;