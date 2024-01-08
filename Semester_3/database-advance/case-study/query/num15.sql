SELECT c.Nama_Cabang, SUM(k.Gaji) AS Total_Gaji
FROM Karyawan k
INNER JOIN Cabang c ON k.ID_Cabang = c.ID_Cabang
GROUP BY c.Nama_Cabang;
