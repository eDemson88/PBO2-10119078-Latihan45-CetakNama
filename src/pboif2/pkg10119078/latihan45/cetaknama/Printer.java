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
public class Printer {
    private int jmlCetak;
    private String nama;
    
    Scanner scanner = new Scanner(System.in);
    
    public int getJmlCetak(){

        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama(){

        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(String nama){
        
        
    }
    
    public void cetak(int jmlCetak, String nama){

        System.out.println("Hasil Cetak: ");
        for (int i = 1 ;i <= jmlCetak; i++){
            System.out.println(i +"." + nama);
        }
    }
}
