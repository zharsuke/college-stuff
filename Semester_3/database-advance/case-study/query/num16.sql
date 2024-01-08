SELECT s.ID_Supplier, s.Nama AS Nama_Supplier, COUNT(p.ID_Produk) AS Jumlah_Produk
FROM Supplier s
INNER JOIN Produk p ON s.ID_Supplier = p.ID_Supplier
GROUP BY s.ID_Supplier, s.Nama
HAVING COUNT(p.ID_Produk) > 50;
