SELECT u.UserName, COUNT(l.LoanID) AS TotalBorrowings
FROM Users u
LEFT JOIN Loans l ON u.UserID = l.UserID
GROUP BY u.UserName;