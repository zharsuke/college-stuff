CREATE TABLE [Library.Books] (
  [BookID] INT PRIMARY KEY,
  [Title] VARCHAR(255),
  [Author] VARCHAR(255),
  [GenreID] INT,
  [PublicationYear] INT
)
GO

CREATE TABLE [Library.Genres] (
  [GenreID] INT PRIMARY KEY,
  [GenreName] VARCHAR(255)
)
GO

CREATE TABLE [Library.Users] (
  [UserID] INT PRIMARY KEY,
  [UserName] VARCHAR(255),
  [MembershipType] VARCHAR(50)
)
GO

CREATE TABLE [Library.Loans] (
  [LoanID] INT PRIMARY KEY,
  [BookID] INT,
  [UserID] INT,
  [LoanDate] DATETIME,
  [ReturnDate] DATETIME
)
GO

ALTER TABLE [Library.Loans] ADD FOREIGN KEY ([UserID]) REFERENCES [Library.Users] ([UserID])
GO

ALTER TABLE [Library.Loans] ADD FOREIGN KEY ([BookID]) REFERENCES [Library.Books] ([BookID])
GO

ALTER TABLE [Library.Books] ADD FOREIGN KEY ([BookID]) REFERENCES [Library.Genres] ([GenreID])
GO
