SELECT Title, Author
FROM Books
WHERE BookID NOT IN (SELECT DISTINCT BookID FROM Loans);