SELECT Kategori, SUM(Jumlah) AS Total_Produk_Terjual
FROM Penjualan p
INNER JOIN Produk pr ON p.ID_Produk = pr.ID_Produk
GROUP BY Kategori;
