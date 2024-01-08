SELECT b.Title, AVG(DATEDIFF(day, l.LoanDate, l.ReturnDate)) AS AvgBorrowingTime
FROM Books b
LEFT JOIN Loans l ON b.BookID = l.BookID
GROUP BY b.Title;