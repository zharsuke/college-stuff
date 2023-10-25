SELECT
    orderid, orderdate, val, LAG(val) OVER(ORDER BY orderid, orderdate) AS prevval, val - LAG(val) OVER(ORDER BY orderid, orderdate) AS diffprev
FROM Sales.OrderValues;