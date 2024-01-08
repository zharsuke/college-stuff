SELECT *
FROM Penjualan
WHERE DATEPART(WEEKDAY, Tanggal) = 6; -- Hari Jumat memiliki nilai 6 pada SQL Server
