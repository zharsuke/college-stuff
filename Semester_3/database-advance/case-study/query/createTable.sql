-- Membuat Tabel Produk
CREATE TABLE Produk (
    ID_Produk INT PRIMARY KEY,
    Nama VARCHAR(100),
    Harga DECIMAL,
    Kategori VARCHAR(50),
    Stok INT
);

-- Tabel Pelanggan
CREATE TABLE Pelanggan (
    ID_Pelanggan INT PRIMARY KEY,
    Nama VARCHAR(100),
    Alamat VARCHAR(200),
    Email VARCHAR(100),
    No_Telepon VARCHAR(15)
);

-- Tabel Penjualan
CREATE TABLE Penjualan (
    ID_Penjualan INT PRIMARY KEY,
    ID_Produk INT,
    ID_Pelanggan INT,
    ID_Karyawan INT,
    Tanggal DATE,
    Jumlah INT,
    Total_Harga DECIMAL
);

-- Tabel Karyawan
CREATE TABLE Karyawan (
    ID_Karyawan INT PRIMARY KEY,
    Nama VARCHAR(100),
    Jabatan VARCHAR(100),
    Gaji DECIMAL,
    ID_Cabang INT
);

-- Tabel Cabang
CREATE TABLE Cabang (
    ID_Cabang INT PRIMARY KEY,
    Nama_Cabang VARCHAR(100),
    Lokasi VARCHAR(200)
);

-- Tabel Supplier
CREATE TABLE Supplier (
    ID_Supplier INT PRIMARY KEY,
    Nama VARCHAR(100),
    Alamat VARCHAR(200),
    No_Telepon VARCHAR(15)
);

-- Tambahkan foreign key constraints dengan ALTER TABLE
ALTER TABLE Penjualan
ADD CONSTRAINT FK_Produk FOREIGN KEY (ID_Produk) REFERENCES Produk(ID_Produk);

ALTER TABLE Penjualan
ADD CONSTRAINT FK_Pelanggan FOREIGN KEY (ID_Pelanggan) REFERENCES Pelanggan(ID_Pelanggan);

ALTER TABLE Penjualan
ADD CONSTRAINT FK_Karyawan FOREIGN KEY (ID_Karyawan) REFERENCES Karyawan(ID_Karyawan);

ALTER TABLE Karyawan
ADD CONSTRAINT FK_Cabang FOREIGN KEY (ID_Cabang) REFERENCES Cabang(ID_Cabang);
