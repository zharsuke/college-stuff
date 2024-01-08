package com.azhar;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Azhar");
        m1.setNim("90233478");
        m1.setNilai(new int[]{90, 89, 99, 80});

        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Rizky");
        m2.setNim("90233479");
        m2.setNilai(new int[]{99, 90, 98, 89});

        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Rizal");
        m3.setNim("90233480");
        m3.setNilai(new int[]{89, 98, 95, 91});

        Mahasiswa m4 = new Mahasiswa();
        m4.setNama("Rizky");
        m4.setNim("90233481");
        m4.setNilai(new int[]{95, 90, 99, 80});

        // Membuat objek MataKuliah
        MataKuliah mk1 = new MataKuliah();
        mk1.setNamaMataKuliah("Matematika 3");
        mk1.setSks(5);
        mk1.setNilaiMahasiswa(new int[]{90, 89, 99, 80});

        MataKuliah mk2 = new MataKuliah();
        mk2.setNamaMataKuliah("Pemrograman Berorientasi Objek");
        mk2.setSks(5);
        mk2.setNilaiMahasiswa(new int[]{99, 90, 98, 89});

        MataKuliah mk3 = new MataKuliah();
        mk3.setNamaMataKuliah("Basis Data");
        mk3.setSks(5);
        mk3.setNilaiMahasiswa(new int[]{89, 98, 95, 91});

        MataKuliah mk4 = new MataKuliah();
        mk4.setNamaMataKuliah("Pemrograman Web");
        mk4.setSks(5);
        mk4.setNilaiMahasiswa(new int[]{95, 90, 99, 80});

        // Membuat objek Perwalian
        Perwalian p = new Perwalian();

        // Menambahkan objek Mahasiswa dan MataKuliah ke dalam objek Perwalian
        p.tambahMahasiswa(m1);
        p.tambahMahasiswa(m2);
        p.tambahMahasiswa(m3);
        p.tambahMahasiswa(m4);
        p.tambahMataKuliah(mk1);
        p.tambahMataKuliah(mk2);
        p.tambahMataKuliah(mk3);
        p.tambahMataKuliah(mk4);

        // Menampilkan data mahasiswa dan mata kuliah yang diambil
        p.printData();
    }
}
