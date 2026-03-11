package com.juaracoding.learnjava.oop;

public class MainOOP {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.grams = 150;
        apple.calsPerGram = 0.52;
        double calories = apple.calculateCalories();
        System.out.println("Calories in the apple: " + calories);

         Kotak kotak1 = new Kotak(5);
        kotak1.draw();
        System.out.println(kotak1.luas());

        Kotak kotak2 = new Kotak(10);
        kotak2.draw();
        System.out.println(kotak2.luas());

        // Encapsulation
        Karyawan karyawan1 = new Karyawan();
        karyawan1.setNama("Steve Job");
        karyawan1.setDivisi("IT");
        karyawan1.setJabatan("CEO Apple");
        karyawan1.setSalary(10000);
        System.out.println(karyawan1.getNama());
        System.out.println(karyawan1.getDivisi());
        System.out.println(karyawan1.getJabatan());
        System.out.println(karyawan1.getSalary());

         // Polymorphism 
        Calculator calculator = new Calculator();
        calculator.sum(10, 5);
        calculator.sum(15, 10 ,5);

        BidangDatar bidangDatar = new BidangDatar();
        bidangDatar.draw();

        BidangDatar segitiga = new Segitiga();
        segitiga.draw();
    }
}
    