SELECT g.GenreName, COUNT(l.BookID) AS NumberOfBorrowings
FROM Genres g
LEFT JOIN Books b ON g.GenreID = b.GenreID
LEFT JOIN Loans l ON b.BookID = l.BookID
GROUP BY g.GenreName;