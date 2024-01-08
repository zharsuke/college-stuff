SELECT pe.ID_Penjualan, pr.Nama AS Nama_Produk, pa.Nama AS Nama_Pelanggan, pe.Total_Harga
FROM Penjualan pe
INNER JOIN Produk pr ON pe.ID_Produk = pr.ID_Produk
INNER JOIN Pelanggan pa ON pe.ID_Pelanggan = pa.ID_Pelanggan
GROUP BY pe.ID_Penjualan, pr.Nama, pa.Nama, pe.Total_Harga
HAVING COUNT(pe.ID_Produk) > 2;
