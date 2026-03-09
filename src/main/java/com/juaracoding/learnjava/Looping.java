package com.juaracoding.learnjava;

public class Looping {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        //     if ( i % 2 != 0) {
        //         System.out.println(i);
        //     }
        // }

        // square
        // int sisi = 10;
        // for (int i = 0; i < sisi; i++) {
        //     for (int j = 0; j < sisi; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // triangle
        // int tinggi = 5;
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // reverse triangle
        // int tinggi = 5;
        for (int i = 5; i >= 1; i--) {  
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");  
            }  
            System.out.println();  
        }
    }
}
