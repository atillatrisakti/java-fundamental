package com.juaracoding.learnjava;

public class Conditional {
    public static void main(String[] args) {
        int bilangan = 11;
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
        // for (int i = 1; i <= 30; i++) {
        //     if (i % 3 == 0  && i % 5 == 0) {
        //         System.out.println("FizzBuzz");
        //     } else if (i % 3 == 0) {
        //         System.out.println("Fizz");
        //     } else if (i % 5 == 0) {
        //         System.out.println("Buzz");
        //     } else {
        //         System.out.println(i);
        //     }
        // }

        // int total = 100000;
        // int discount = 10;

        // if (total >= 100000) {
        //     total = total - (total * discount / 100);
        //     System.out.println("Selamat! Anda mendapatkan diskon 10%, total yang harus dibayar: " + total);
        // } else {
        //     System.out.println("Total belanja Anda: " + total + ". Belanja lebih banyak untuk mendapatkan diskon!");
        // }

        int count = 0;
        int minOrder = 1;
        if (count < minOrder) {
            System.out.println("Jumlah order tidak boleh kurang dari " + minOrder);
        } else {
            System.out.println("Pesanan berhasil diproses");
        }

        int stock = 9;
        if (count > stock) {
            System.out.println("Jumlah order melebihi stok yang tersedia");
        } else if (count < stock) {
            System.out.println("Jumlah order tidak boleh kurang dari " + minOrder);
        } else {
            System.out.println("Pesanan berhasil diproses");
        }

    }
}
