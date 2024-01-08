package com.azhar;

public class Mahasiswa {
    private String nama, nim;
    private int[] nilai; // Menyimpan nilai-nilai mata kuliah

    // Konstruktor default
    public Mahasiswa() {
    
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nama, String nim, int[] nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Getter untuk mendapatkan nama mahasiswa
    public String getNama() {
        return nama;
    }

    // Getter untuk mendapatkan NIM mahasiswa
    public String getNim() {
        return nim;
    }

    // Getter untuk mendapatkan nilai mata kuliah
    public int[] getNilai() {
        return nilai;
    }

    // Setter untuk mengatur nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk mengatur NIM mahasiswa
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Setter untuk mengatur nilai mata kuliah
    public void setNilai(int[] nilai) {
        this.nilai = nilai;
    }

    // Menghitung IPK dari nilai mata kuliah tanpa bobot SKS
    public double hitungIpk() {
        double total = 0;
        for (int i : this.nilai) {
            total += i; // Menambahkan setiap nilai ke total
        }
        return total / this.nilai.length; // Mengembalikan rata-rata nilai
    }

    // Menghitung IPK dari nilai mata kuliah dengan bobot SKS
    public double hitungIpk(int[] nilaiSks) {
        double totalBobot = 0; // Total bobot nilai
        int totalSks = 0; // Total SKS
        for (int i : this.nilai) {
            totalBobot += i * nilaiSks[i]; // Menambahkan bobot nilai
            totalSks += nilaiSks[i]; // Menambahkan total SKS
        }

        // Mengembalikan IPK jika total SKS lebih besar dari 0, jika tidak mengembalikan 0
        return totalSks > 0 ? totalBobot / totalSks : 0;
    }
}
