SELECT b.Title, COUNT(l.LoanID) AS BorrowCount
FROM Books b
LEFT JOIN Loans l ON b.BookID = l.BookID
GROUP BY b.Title
ORDER BY BorrowCount DESC;