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
public class Latihan654PerpangkatanWhileLoop {
    public static void main( String[] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        int angka = 0;
        int pangkat = 0;
        int nilai = 1;
        int i = 0;
        
        try { 
            System.out.print("Inputkan angka= ");
            angka = Integer.parseInt(dataIn.readLine());
            System.out.print("Inputkan nilai pangkat= ");
            pangkat = Integer.parseInt(dataIn.readLine());
        } catch(IOException e) {  
            System.out.println("Erro9r dalam membaca input");
        }
       
        i=pangkat-1;
        while(i>=0){
           nilai = nilai*angka;
           i--;
       }
        System.out.println("Hasil perpangkatan= " + nilai);
    }
}
