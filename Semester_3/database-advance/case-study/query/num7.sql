SELECT ID_Karyawan, Nama, 
       SUM(Jumlah) OVER(PARTITION BY ID_Karyawan) AS Total_Penjualan,
       AVG(Jumlah) OVER(PARTITION BY ID_Karyawan) AS Rata_Rata_Penjualan
FROM Penjualan p
INNER JOIN Karyawan k ON p.ID_Karyawan = k.ID_Karyawan;
