/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan22perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S 
 * Kelas : IF-3 / PBO-3 
 * Nim : 10117119 
 * Deskripsi : Program ini menghitung jari-jari, luas dan keliling lingkaran
 */
public class PBO310117119Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String n;
    double r,L,diameter,K;
    
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("====PROGRAM PERHITUNGAN LINGKARAN====");
        System.out.println("");
        do{
            System.out.print("Masukan Nilai Diameter Lingkaran : ");
            n = scanner.nextLine();
            
            System.out.println((!n.matches("[0-9]*"))?"Nilai Diameter Tidak"
                    + " Sesuai\n":"");
        }
        while(!n.matches("[0-9]*"));
        
        System.out.println("\n====HASIL PERHITUNGAN LINGKARAN====");
        diameter = Double.parseDouble(n);
        r = diameter/2;
        System.out.printf("Jari-Jari Lingkaran = %.0f cm %n",r);
        L = Math.PI*r*r;
        System.out.printf("Luas Lingkaran =%.2f cm %n",L);
        K = 2*Math.PI*r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n",K);
               
    }

}
