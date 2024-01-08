INSERT INTO Genres (GenreID, GenreName) VALUES
(1, 'Self Improvement'),
(2, 'Romance'),
(3, 'Inspirational'),
(4, 'Business'),
(5, 'Fiction'),
(6, 'Non-Fiction'),
(7, 'Biography'),
(8, 'History'),
(9, 'Science'),
(10, 'Fantasy');

INSERT INTO Users (UserID, UserName, MembershipType) VALUES
(1, 'Zharsuke', 'Platinum'),
(2, 'Azhar', 'Platinum'),
(3, 'Rizqi', 'Gold'),
(4, 'Faiz', 'Silver'),
(5, 'Fuad', 'Silver');

INSERT INTO Books (BookID, Title, Author, GenreID, PublicationYear) VALUES
(1, 'Dilan 1991', 'Pidi Baiq', 2, 2015),
(2, 'Psychology of Money', 'Morgan Housel', 1, 2020),
(3, 'Atomic Habits', 'James Clear', 1, 2018),
(4, 'The Subtle Art of Not Giving a F*ck', 'Mark Manson', 1, 2016),
(5, 'Offline: Finding Yourself in the Age of Distractions', 'Desi Anwar', 3, 2020),
(6, 'Esentialism: The Disciplined Pursuit of Less', 'Greg Mckeown', 1, 2022),
(7, 'Filosofi Teras', 'Henry Manampiring', 1, 2018),
(8, 'The Courage to Be Disliked', 'Ichiro Kishimi & Fumitake Koga', 1, 2019),
(9, 'RICH DAD POOR DAD', 'Robert T. Kiyosaki', 4, 2000),
(10, 'Bicara Itu Ada Seninya', 'Oh Su Hyang', 6, 2019);

INSERT INTO Loans (LoanID, BookID, UserID, LoanDate, ReturnDate) VALUES
(1, 1, 1, '2022-01-01', '2022-01-10'),
(2, 2, 2, '2022-01-02', '2022-01-11'),
(3, 3, 3, '2022-01-03', '2022-01-12'),
(4, 4, 4, '2022-01-04', '2022-01-13'),
(5, 5, 5, '2022-01-05', '2022-01-14'),
(6, 6, 1, '2022-01-06', '2022-01-15'),
(7, 7, 2, '2022-01-07', '2022-01-16'),
(8, 8, 3, '2022-01-08', '2022-01-17'),
(9, 9, 4, '2022-01-09', '2022-01-18'),
(10, 10, 5, '2022-01-10', '2022-01-19'),
(11, 1, 1, '2022-01-11', '2022-01-20'),
(12, 2, 2, '2022-01-12', '2022-01-21'),
(13, 3, 3, '2022-01-13', '2022-01-22'),
(14, 4, 4, '2022-01-14', '2022-01-23'),
(15, 5, 5, '2022-01-15', '2022-01-24'),
(16, 6, 1, '2022-01-16', '2022-01-25'),
(17, 7, 2, '2022-01-17', '2022-01-26'),
(18, 8, 3, '2022-01-18', '2022-01-27'),
(19, 9, 4, '2022-01-19', '2022-01-28'),
(20, 10, 5, '2022-01-20', '2022-01-29'),
(21, 1, 1, '2022-01-21', '2022-01-30'),
(22, 2, 2, '2022-01-22', '2022-01-31'),
(23, 3, 3, '2022-01-23', '2022-02-01'),
(24, 4, 4, '2022-01-24', '2022-02-02'),
(25, 5, 5, '2022-01-25', '2022-02-03');
