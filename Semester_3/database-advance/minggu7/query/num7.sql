WITH OrderRows AS (
    SELECT
        orderid, orderdate, val, ROW_NUMBER() OVER(ORDER BY orderdate, orderid) AS rowno
    FROM Sales.OrderValues
)
SELECT * FROM OrderRows;