/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmandiri;
import java.util.Scanner;
/**
 *
 * @author DEA
 */
public class BankMandiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===============================");
        System.out.println("Selamat Datang di Bank Mandiri");
        System.out.println("===============================");
        System.out.println("Berikut Merupakan Data Antrian Nasabah");
        int x =0;
        int jumlahantrian = 5;
        String nama[] = new String[jumlahantrian];
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Masukkan Nama Nasabah");
            for (int i = 0; i < nama.length; i++) {
            System.out.print("Nama Nasabah Urutan ke-"+ (i+1)+" : ");
            nama[i] = sc.nextLine();
        }
            System.out.println();
        
        System.out.println("Data Antrian Nasabah : ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama Nasabah Urutan ke-"+ (i+1) + " adalah " + nama[i]);
            
            
    }
}
}
