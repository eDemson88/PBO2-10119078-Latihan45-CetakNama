/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Printer print = new Printer();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan nama anda: ");
        print.setNama(scanner.nextLine());
        System.out.println("Mau cetak nama berapa kali? : ");
        print.setJmlCetak (scanner.nextInt());

        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }
    
}
