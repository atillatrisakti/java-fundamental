package com.juaracoding.learnjava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int stock = 9;
        int count = 10;
        int minOrder = 1;

        if (count < minOrder) {
            System.out.println("Jumlah order tidak boleh kurang dari " + minOrder);
        } else if (count > stock) {
            System.out.println("Jumlah order melebihi stok yang tersedia");
        } else {
            System.out.println("Pesanan berhasil diproses");
        }
        
    }


}
