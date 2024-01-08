SELECT k.Nama AS Nama_Karyawan, MAX(p.Total_Harga) AS Penjualan_Tertinggi
FROM Karyawan k
INNER JOIN Penjualan p ON k.ID_Karyawan = p.ID_Karyawan
GROUP BY k.Nama;
