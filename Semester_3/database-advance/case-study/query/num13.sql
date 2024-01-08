DELETE FROM Karyawan
WHERE ID_Karyawan NOT IN (
    SELECT DISTINCT k.ID_Karyawan
    FROM Karyawan k
    INNER JOIN Penjualan p ON k.ID_Karyawan = p.ID_Karyawan
    WHERE p.Tanggal >= DATEADD(MONTH, -6, GETDATE())
);
