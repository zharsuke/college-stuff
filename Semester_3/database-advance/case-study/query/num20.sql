SELECT *
FROM Produk
WHERE Stok > (SELECT AVG(Stok) FROM Produk);
