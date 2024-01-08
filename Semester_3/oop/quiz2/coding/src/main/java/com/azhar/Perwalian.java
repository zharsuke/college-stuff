package com.azhar;

import java.util.ArrayList;
import java.util.List;

public class Perwalian {
    private List<Mahasiswa> mahasiswa; // Menyimpan daftar mahasiswa yang melakukan perwalian
    private List<MataKuliah> mataKuliah; // Menyimpan daftar mata kuliah yang diambil oleh mahasiswa

    // Konstruktor untuk inisialisasi list mahasiswa dan mata kuliah
    public Perwalian() {
        this.mahasiswa = new ArrayList<>(); // Inisialisasi list mahasiswa sebagai ArrayList kosong
        this.mataKuliah = new ArrayList<>(); // Inisialisasi list mata kuliah sebagai ArrayList kosong
    }

    // Method untuk menambahkan objek Mahasiswa ke dalam list mahasiswa
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa.add(mahasiswa);
    }

    // Method untuk menambahkan objek MataKuliah ke dalam list mataKuliah
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah.add(mataKuliah);
    }

    // Method untuk mencetak data mahasiswa beserta mata kuliah yang diambil beserta informasi terkait
    public void printData() {
        System.out.println("==========Data Mahasiswa==========");
        for (int i = 0; i < this.mahasiswa.size(); i++) {
            System.out.println("Nama: " + this.mahasiswa.get(i).getNama());
            System.out.println("NIM: " + this.mahasiswa.get(i).getNim());
            System.out.println("IPK: " + this.mahasiswa.get(i).hitungIpk());
            System.out.println("Mata Kuliah: " + this.mataKuliah.get(i).getNamaMataKuliah());
            System.out.println("SKS: " + this.mataKuliah.get(i).getSks());
            System.out.println("Bobot: " + this.mataKuliah.get(i).hitungBobot());
            System.out.println();
        }
    }
}
