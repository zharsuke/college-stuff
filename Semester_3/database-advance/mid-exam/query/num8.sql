WITH UserBorrowings AS (
    SELECT u.UserName, COUNT(l.LoanID) AS TotalBorrowings
    FROM Users u
    LEFT JOIN Loans l ON u.UserID = l.UserID
    GROUP BY u.UserName
)
SELECT UserName
FROM UserBorrowings
WHERE TotalBorrowings > (SELECT AVG(TotalBorrowings) FROM UserBorrowings);