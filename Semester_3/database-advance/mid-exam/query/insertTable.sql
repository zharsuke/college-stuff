-- Tambahkan data random sesuai dengan kebutuhan masing-masing tabel.

-- • Tabel Books dan Tabel Genres memiliki minimal 10 data
INSERT INTO Library.Books (BookID, Title, Author, GenreID, PublicationYear)
VALUES
    ('B0001', 'Psychology of Money', 'Morgan Housel', 'G0001', 2020),
    ('B0002', 'Atomic Habits', 'James Clear', 'G0001', 2018),
    ('B0003', 'The Subtle Art of Not Giving a F*ck', 'Mark Manson', 'G0001', 2016),
    ('B0004', 'Harry Potter and the Goblet of Fire', 'J.K. Rowling', 'G0001', 2000),
    ('B0005', 'Harry Potter and the Order of the Phoenix', 'J.K. Rowling', 'G0001', 2003),
    ('B0006', 'Harry Potter and the Half-Blood Prince', 'J.K. Rowling', 'G0001', 2005),
    ('B0007', 'Harry Potter and the Deathly Hallows', 'J.K. Rowling', 'G0001', 2007),
    ('B0008', 'The Da Vinci Code', 'Dan Brown', 'G0002', 2003),
    ('B0009', 'Angels & Demons', 'Dan Brown', 'G0002', 2000),
    ('B0010', 'Inferno', 'Dan Brown', 'G0002', 2013);

INSERT INTO Library.Genres (GenreID, GenreName)
VALUES
    ('G0001', 'Self-Improvement'),
    ('G0002', 'Mystery');

-- • Tabel Users memiliki minimal 5 data (salah satunya data diri sendiri)

-- • Tabel Loans memiliki minimal 25 data