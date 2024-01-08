SELECT *
FROM (
    SELECT MONTH(LoanDate) AS BorrowMonth, COUNT(LoanID) AS BorrowCount
    FROM Loans
    WHERE LoanDate >= DATEADD(year, -1, '2022')
    GROUP BY MONTH(LoanDate)
) AS MonthlyBorrowings
PIVOT (
    SUM(BorrowCount)
    FOR BorrowMonth IN ([1], [2], [3], [4], [5], [6], [7], [8], [9], [10], [11], [12])
) AS PivotTable;