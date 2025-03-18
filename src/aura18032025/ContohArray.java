/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura18032025;

/**
 *
 * @author PANISA
 */
public class ContohArray {
    public static void main( String[] args ){
        boolean results[] = {true, false, true, false};
        double[] grades = {100, 90, 80, 75}; 
        String days[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        int i;
        System.out.println("Results ke->0 adalah " + results[0]);
    
    for(i=0; i<days.length; i++){
        System.out.print("Hari ke->" + i);
        System.out.println(" adalah " + days[i]);
    }
    
    } 
}
