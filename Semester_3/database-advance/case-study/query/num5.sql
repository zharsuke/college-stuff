SELECT c.Nama_Cabang, SUM(p.Jumlah) AS Total_Penjualan
FROM Penjualan p
INNER JOIN Karyawan k ON p.ID_Karyawan = k.ID_Karyawan
INNER JOIN Cabang c ON k.ID_Cabang = c.ID_Cabang
GROUP BY c.Nama_Cabang;
