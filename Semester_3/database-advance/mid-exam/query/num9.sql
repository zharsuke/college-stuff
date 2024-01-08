SELECT b.Title, u.UserName, l.LoanDate, l.ReturnDate
FROM Books b
JOIN Loans l ON b.BookID = l.BookID
JOIN Users u ON l.UserID = u.UserID
WHERE b.BookID = 2;