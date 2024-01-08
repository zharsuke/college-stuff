-- Gunakan operasi pivoting untuk menampilkan jumlah buku yang dipinjam per bulan dalam tahun terakhir.

SELECT * FROM (
    SELECT
        MONTHNAME(tanggal_pinjam) AS bulan,
        COUNT(*) AS jumlah
    FROM
        peminjaman
    WHERE
        YEAR(tanggal_pinjam) = 2019
    GROUP BY
        MONTH(tanggal_pinjam)
) AS p