/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura13032025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author PANISA
 */
public class Latihan653CetakSeratusKaliDoWhile {
    public static void main( String[] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        String nama = "";
        int angka = 100;
        int i = 1;
        
        try { 
            System.out.print("Masukkan Nama: ");
            nama = dataIn.readLine(); 
        } catch(IOException e) {  
            System.out.println("Error dalam membaca input");
        }
        
        do{
        System.out.print(" " + i);
        System.out.println(" " + nama);
        i++;
        angka--;
        }while(angka>=1);
        
    }
}
