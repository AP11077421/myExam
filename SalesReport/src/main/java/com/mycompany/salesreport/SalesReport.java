/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
import java.util.*;
public class SalesReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] sales = new int[3][3];
        int[] month = {1,2,3};
        String[] bedName ={"Cozy Nights Monarch","Restonic Barbados","Sealy Phuket"};
        
        for (int x = 0; x < sales.length; x++){
            for (int j = 0; j < sales[x].length; j++){
                System.out.print("Enter number of sales for month "+ month[j]+" for "+bedName[x]+" mattress: ");
                sales[x][j] = input.nextInt();
            }
        }
        
        int count = 0,totalSales = 0;
        int popular = 0;
        String popularBrand = bedName[0];
        for (int k = 0; k < sales.length; k++){
            for(int m = 0; m < sales[k].length; m++){
                totalSales = totalSales + sales[k][m];
                count++;
                if (popular > totalSales){
                    popularBrand = bedName[k];
                }
            }
        }
        
        int average = totalSales / count;
        
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        
        System.out.println("TOTAL PRODUCT SLAES: "+totalSales);
        System.out.println("AVERAGE PRODUCT SALES: "+average);
        System.out.println("MOST POPULAR PRODUCT: "+popularBrand);
    }
}
