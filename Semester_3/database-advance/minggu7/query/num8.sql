WITH OrderRows AS (
    SELECT
        orderid, orderdate, ROW_NUMBER() OVER(ORDER BY orderdate, orderid) AS rowno, val
    FROM Sales.OrderValues
)
SELECT 
    o.orderid, o.orderdate, o.val, r.val AS prevval, o.val - r.val AS diffprev
FROM OrderRows AS o
LEFT OUTER JOIN OrderRows AS r ON o.rowno = r.rowno + 1;