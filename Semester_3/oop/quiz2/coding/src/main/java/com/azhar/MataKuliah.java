package com.azhar;

public class MataKuliah {
    private String namaMataKuliah; // Menyimpan nama mata kuliah
    private int sks; // Menyimpan jumlah SKS (Satuan Kredit Semester) dari mata kuliah
    private int[] nilaiMahasiswa; // Menyimpan nilai mahasiswa untuk mata kuliah tertentu

    // Konstruktor default
    public MataKuliah() {
    
    }

    // Konstruktor dengan parameter
    public MataKuliah(String namaMataKuliah, int sks, int[] nilaiMahasiswa) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    // Getter untuk mendapatkan nama mata kuliah
    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    // Getter untuk mendapatkan jumlah SKS
    public int getSks() {
        return sks;
    }

    // Getter untuk mendapatkan nilai mahasiswa
    public int[] getNilaiMahasiswa() {
        return nilaiMahasiswa;
    }

    // Setter untuk mengatur nama mata kuliah
    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    // Setter untuk mengatur jumlah SKS
    public void setSks(int sks) {
        this.sks = sks;
    }

    // Setter untuk mengatur nilai mahasiswa
    public void setNilaiMahasiswa(int[] nilaiMahasiswa) {
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    // Menghitung rata-rata bobot nilai untuk mata kuliah
    public double hitungBobot() {
        double totalBobot = 0;
        for (int i : this.nilaiMahasiswa) {
            totalBobot += i; // Menambahkan setiap nilai ke total bobot
        }
        return totalBobot / this.nilaiMahasiswa.length; // Mengembalikan rata-rata bobot nilai
    }

    // Menghitung bobot nilai dengan bobot tertentu untuk mata kuliah
    public double hitungBobot(int bobotMahasiswa) {
        double totalBobot = 0;
        double totalSks = 0;
        for (int i : this.nilaiMahasiswa) {
            totalBobot += i * bobotMahasiswa; // Menambahkan bobot nilai
            totalSks += bobotMahasiswa; // Menambahkan total SKS
        }
        return totalBobot / totalSks; // Mengembalikan hasil perhitungan bobot nilai
    }
}
