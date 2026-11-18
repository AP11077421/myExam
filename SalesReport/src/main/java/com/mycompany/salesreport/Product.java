/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct{
    private String[] productNames;
    private int[][] sales;

    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }
    
    @Override
    public int GetTotalProductSold(){
        int total = 0;
        for(int i = 0; i < sales.length; i++){
            for(int j = 0; j < sales[i].length; j++){
                total = total + sales[i][j];
            }
        }
        return total;
    }
    
    @Override
    public String GetMostPopularProduct(){
        int maxTotal = -1;
        String mostPopular = "";
        
        for (int i = 0; i < sales.length; i++){
            int productTotal = 0;
            for(int j = 0; j < sales[i].length; j++){
                productTotal = productTotal + sales[i][j];
                
            }
            if (productTotal > maxTotal){
                maxTotal = productTotal;
                mostPopular = productNames[i];
            }
        }
        return mostPopular;
    }

    @Override
    public Double GetAverageProducts() {
        int total = GetTotalProductSold();
        int count = sales.length * sales[0].length;
        return (double) total / count;
    }
    
    
}
