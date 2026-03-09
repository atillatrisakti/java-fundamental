package com.juaracoding.learnjava;

import java.util.Scanner;

public class ATMConsole {

    static Scanner scanner = new Scanner(System.in);
    static double saldo = 0;

    public static void main(String[] args) {
        System.out.println("=== Selamat Datang di Aplikasi ATM ===");
        
        if (login()) {
            boolean lanjutTransaksi = true;
            
            do {
                System.out.println("\n--- Menu Utama ---");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Setor Tunai");
                System.out.println("3. Tarik Tunai");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1-4): ");
                
                int pilihan = scanner.nextInt();
                
                switch (pilihan) {
                    case 1:
                        cekSaldo();
                        break;
                    case 2:
                        setorTunai();
                        break;
                    case 3:
                        tarikTunai();
                        break;
                    case 4:
                        lanjutTransaksi = false;
                        System.out.println("Terima kasih telah menggunakan ATM kami.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } while (lanjutTransaksi);
            
        } else {
            System.out.println("Akses ditolak. Program dihentikan.");
        }
        
        scanner.close();
    }

    static boolean login() {
        int pinBenar = 123456; 
        System.out.print("Masukkan PIN Anda: ");
        int pinInput = scanner.nextInt();
        
        if (pinInput == pinBenar) {
            System.out.println("Login Berhasil!");
            return true;
        } else {
            System.out.println("PIN Salah!");
            return false;
        }
    }

    static void cekSaldo() {
        System.out.println("\n[INFO] Saldo Anda saat ini: Rp " + saldo);
    }

    static void setorTunai() {
        System.out.print("\nMasukkan nominal setor tunai: Rp ");
        double jumlahSetor = scanner.nextDouble();
        
        if (jumlahSetor > 0) {
            saldo += jumlahSetor; 
            System.out.println("Setor tunai berhasil.");
            cekSaldo(); 
        } else {
            System.out.println("Nominal harus lebih dari 0.");
        }
    }

    static void tarikTunai() {
        System.out.print("\nMasukkan nominal tarik tunai: Rp ");
        double jumlahTarik = scanner.nextDouble();
        
        if (jumlahTarik > 0 && jumlahTarik <= saldo) {
            saldo -= jumlahTarik; 
            System.out.println("Tarik tunai berhasil.");
            cekSaldo(); 
        } else if (jumlahTarik > saldo) {
            System.out.println("Maaf, saldo Anda tidak mencukupi untuk penarikan ini.");
        } else {
            System.out.println("Nominal harus lebih dari 0.");
        }
    }
}