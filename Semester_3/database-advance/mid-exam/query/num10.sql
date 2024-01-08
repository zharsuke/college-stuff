SELECT u.UserName
FROM Users u
JOIN Loans l ON u.UserID = l.UserID
WHERE l.BookID = 5 AND l.LoanDate = '2022-01-05';