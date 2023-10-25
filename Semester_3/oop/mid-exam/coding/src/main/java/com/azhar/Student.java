package com.azhar;

public class Student {
    String nim, nama, alamat;
    char jenisKelamin;
    // a. Tambahkan constructor
    // Gunakan constructor untuk
    // mengisi atribut nim, nama, alamat, jenisKelamin
    public Student(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    public static void main(String[] args) {
    // b. Buat objek mahasiswa
    // Isi atribut nim, nama, alamat, jenisKelamin
    // lewat constructor
    Student mahasiswa = new Student("123456789", "Azhar", "Jalan Merdeka", 'L');
    }
}
