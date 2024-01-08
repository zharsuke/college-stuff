SELECT Kategori, AVG(Harga) AS Rata_Rata_Harga
FROM Produk
GROUP BY Kategori;
