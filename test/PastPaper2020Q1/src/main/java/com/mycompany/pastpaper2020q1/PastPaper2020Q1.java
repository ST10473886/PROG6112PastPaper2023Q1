/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pastpaper2020q1;

/**
 *
 * @author conno
 */
public class PastPaper2020Q1 {

    public static void main(String[] args) {
        String[] month = {"JAN", "FEB", "MAR"};
        String[] city = {"JHB", "DBN", "CTN", "PE"};
        
        int[][] speedingFines = {
            {128, 135, 139},
            {155, 129, 175},
            {129, 130, 185},
            {195, 155, 221}
        };
        
        String border = "*******************************************************";
        System.out.println(border);
        System.out.println("SPEEDING FINES REPORT");
        System.out.println(border);
        
        
        for(int i = 0; i < month.length; i++){
            System.out.print("\t\t" + month[i]);
        }
        System.out.println();
        
        for(int row = 0; row < city.length; row++){
            System.out.print(city[row] + "\t");
            for(int col = 0; col < speedingFines[row].length; col++){
                System.out.print("\t" + speedingFines[row][col] + "\t");
            }
            System.out.println();
        }
        
        System.out.println(border);
        System.out.println("SPEEDING FINE STATISTICS");
        System.out.println(border);
        
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < city.length; row++){
            for(int col = 0; col < speedingFines[row].length; col++){
                if(max < speedingFines[row][col]){
                    max = speedingFines[row][col];
                }
            }
        }
        System.out.println("Maximum speed captured: " + max);
        
        
        int min = Integer.MAX_VALUE;
        for(int row = 0; row < city.length; row++){
            for(int col = 0; col < speedingFines[row].length; col++){
                if(min > speedingFines[row][col]){
                    min = speedingFines[row][col];
                }
            }
        }
        System.out.println("Minimum speed captured: " + min);
        System.out.println(border);
        
    }
}
