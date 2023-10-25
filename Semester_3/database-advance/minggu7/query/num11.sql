WITH SalesMonth2007 AS (
    SELECT
        MONTH(orderdate) AS monthno,
        SUM(val) AS val
    FROM Sales.OrderValues
    WHERE YEAR(orderdate) = 2007
    GROUP BY MONTH(orderdate)
)
SELECT monthno, val, (LAG(val, 1, 0)
    OVER (ORDER BY monthno) + LAG(val, 2, 0)
    OVER (ORDER BY monthno) + LAG(val, 3, 0)
    OVER (ORDER BY monthno)) / 3 AS avglast3months, val - FIRST_VALUE(val)
    OVER (ORDER BY monthno ROWS UNBOUNDED PRECEDING) AS diffjanuary, LEAD(val) OVER (ORDER BY monthno) AS nextval
FROM SalesMonth2007;