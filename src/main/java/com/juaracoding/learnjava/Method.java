package com.juaracoding.learnjava;

public class Method {
   public static void main(String[] args) {
        
        // method tanpa parameter
        kotak();
        System.out.println();
        kotak();

        // method parameter
        segitiga(5);
        System.out.println();
        segitiga(10);

        // method return
        System.out.println(luasKotak(5));
        System.out.println(luasKotak(10));

        


    }

    public static double discount(double price, int discount) {
        return price - (price * discount / 100);

    }

    public static double subTotal(int qty, double price, int discount) {
        double total = price  * qty;
        
        if (total > 100000) {
            return discount(total, discount);
        } else {
            return total;
        }
    }

    public static int luasKotak(int sisi){
        return sisi * sisi;
    }

    public static void kotak(){
        int sisi = 5; 
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void segitiga(int sisi){
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= i; j++) { // 1 <= 2
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
