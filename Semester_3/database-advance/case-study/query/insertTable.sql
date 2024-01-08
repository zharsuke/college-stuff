INSERT INTO Penjualan (ID_Penjualan, ID_Produk, ID_Pelanggan, ID_Karyawan, Tanggal, Jumlah, Total_Harga)
VALUES
    (1, 1, 2, 1, '2023-01-05', 2, 120.0),
    (2, 3, 5, 3, '2023-01-08', 1, 70.0),
    (3, 5, 1, 4, '2023-01-10', 3, 90.0),
    (4, 2, 3, 2, '2023-01-12', 1, 60.0),
    (5, 4, 6, 5, '2023-01-15', 2, 240.0),
    (6, 6, 4, 1, '2023-01-18', 1, 55.0),
    (7, 7, 7, 3, '2023-01-20', 2, 80.0),
    (8, 9, 10, 2, '2023-01-22', 1, 80.0),
    (9, 8, 8, 4, '2023-01-25', 1, 90.0),
    (10, 10, 9, 5, '2023-01-28', 3, 450.0);


-- Memasukkan 10 data ke dalam tabel Produk
-- INSERT INTO Produk (ID_Produk, Nama, Harga, Kategori, Stok)
-- VALUES
--     (1, 'Baju Wanita A', 50.0, 'Pakaian Wanita', 20),
--     (2, 'Baju Wanita B', 60.0, 'Pakaian Wanita', 15),
--     (3, 'Celana Panjang Pria', 70.0, 'Pakaian Pria', 18),
--     (4, 'Sepatu Sneakers', 120.0, 'Sepatu', 25),
--     (5, 'Topi Fedora', 30.0, 'Aksesoris', 30),
--     (6, 'Kemeja Flanel', 55.0, 'Pakaian Pria', 12),
--     (7, 'Kaus Crop Top', 40.0, 'Pakaian Wanita', 20),
--     (8, 'Tas Ransel', 90.0, 'Aksesoris', 10),
--     (9, 'Jaket Denim', 80.0, 'Pakaian Pria', 15),
--     (10, 'Gaun Pesta', 150.0, 'Pakaian Wanita', 8);

-- INSERT INTO Pelanggan (ID_Pelanggan, Nama, Alamat, Email, No_Telepon)
-- VALUES
--     (1, 'John Doe', 'Jl. Mawar No. 10', 'john@example.com', '1234567890'),
--     (2, 'Jane Smith', 'Jl. Kenanga No. 5', 'jane@example.com', '9876543210'),
--     (3, 'Michael Johnson', 'Jl. Melati No. 8', 'michael@example.com', '5555555555'),
--     (4, 'Sarah Williams', 'Jl. Anggrek No. 12', 'sarah@example.com', '11112222333'),
--     (5, 'David Brown', 'Jl. Dahlia No. 3', 'david@example.com', '99998888777'),
--     (6, 'Emma Garcia', 'Jl. Kamboja No. 7', 'emma@example.com', '44443333222'),
--     (7, 'Oliver Martinez', 'Jl. Tulip No. 15', 'oliver@example.com', '66667777888'),
--     (8, 'Sophia Lee', 'Jl. Sakura No. 20', 'sophia@example.com', '33334444555'),
--     (9, 'William Rodriguez', 'Jl. Flamboyan No. 9', 'william@example.com', '22221111333'),
--     (10, 'Ava Wilson', 'Jl. Lavender No. 25', 'ava@example.com', '77776666555');




-- INSERT INTO Karyawan (ID_Karyawan, Nama, Jabatan, Gaji, ID_Cabang)
-- VALUES
--     (1, 'Alex Turner', 'Manager', 5000.0, 1),
--     (2, 'Elena Gomez', 'Sales Associate', 3000.0, 2),
--     (3, 'Jack White', 'Sales Associate', 3000.0, 1),
--     (4, 'Sophie Johnson', 'Storekeeper', 2500.0, 3),
--     (5, 'Chris Evans', 'Manager', 5000.0, 2),
--     (6, 'Lucas Miller', 'Sales Associate', 3000.0, 3),
--     (7, 'Lily Brown', 'Sales Associate', 3000.0, 1),
--     (8, 'Tom Parker', 'Storekeeper', 2500.0, 2),
--     (9, 'Natalie King', 'Manager', 5000.0, 3),
--     (10, 'Oscar Davis', 'Sales Associate', 3000.0, 2);


-- INSERT INTO Cabang (ID_Cabang, Nama_Cabang, Lokasi)
-- VALUES
--     (1, 'Cabang A', 'Jl. Anggrek No. 1'),
--     (2, 'Cabang B', 'Jl. Kenanga No. 5'),
--     (3, 'Cabang C', 'Jl. Dahlia No. 10'),
--     (4, 'Cabang D', 'Jl. Mawar No. 8'),
--     (5, 'Cabang E', 'Jl. Melati No. 3'),
--     (6, 'Cabang F', 'Jl. Sakura No. 12'),
--     (7, 'Cabang G', 'Jl. Flamboyan No. 7'),
--     (8, 'Cabang H', 'Jl. Tulip No. 20'),
--     (9, 'Cabang I', 'Jl. Kamboja No. 15'),
--     (10, 'Cabang J', 'Jl. Lavender No. 25');


-- INSERT INTO Supplier (ID_Supplier, Nama, Alamat, No_Telepon)
-- VALUES
--     (1, 'Supplier A', 'Jl. Supplier A No. 1', '11112222333'),
--     (2, 'Supplier B', 'Jl. Supplier B No. 5', '55556666777'),
--     (3, 'Supplier C', 'Jl. Supplier C No. 8', '88889999111'),
--     (4, 'Supplier D', 'Jl. Supplier D No. 12', '12121212121'),
--     (5, 'Supplier E', 'Jl. Supplier E No. 15', '15151515151'),
--     (6, 'Supplier F', 'Jl. Supplier F No. 20', '20202020202'),
--     (7, 'Supplier G', 'Jl. Supplier G No. 25', '25252525252'),
--     (8, 'Supplier H', 'Jl. Supplier H No. 30', '30303030303'),
--     (9, 'Supplier I', 'Jl. Supplier I No. 35', '35353535353'),
--     (10, 'Supplier J', 'Jl. Supplier J No. 40', '40404040404');
