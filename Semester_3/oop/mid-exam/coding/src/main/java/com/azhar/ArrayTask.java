package com.azhar;

public class ArrayTask {
    public static void main(String[] args) {
        int[][] arrayInt = {{1, 1, 4}, {2, 1, 2}, {3, 2, 1}};
        // hitung jumlah elemen array 2 dimensi
        // gunakan perulangan
        int total = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt.length; j++) {
                total += arrayInt[i][j];
            }
        }

        System.out.println("Total amount of elements in array: " + total);
        }
}
