/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119052.rizkidwinugraha.pkg6;
import java.util.Scanner;

/**
 * NIM     : 10119052
 * NAMA    : Rizki Dwi Nugraha
 * KELAS   : IF-2
 * TANGGAL : 20 FEBRUARI 2021
 * NO SOAL : 6
 */
public class Kalkulator {
     public static void main(String[] args) {
        UASIF210119052RIZKIDWINUGRAHA6 kalkulator = new UASIF210119052RIZKIDWINUGRAHA6();
        
        System.out.println("Kalkulator Ku");
        System.out.print("Masukkan Value Bilangan Pertama : ");
        Scanner input = new Scanner(System.in);
        kalkulator.value1 = input.nextDouble();
        System.out.print("Masukkan Value Bilangan Kedua : ");
        kalkulator.value2 = input.nextDouble();
        
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + kalkulator.fungsiTambah());
        System.out.println("Hasil Pengurangan : " + kalkulator.fungsiKurang());
        System.out.println("Hasil Perkalian : " + kalkulator.fungsiKali());
        System.out.println("Hasil Pembagian : " + kalkulator.fungsiBagi());
        System.out.println("Hasil Sisa : " + kalkulator.fungsiSisa());
    }
     
}
