/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivity;

/**
 *
 * @author L15Y13W03
 */
public class Activity21 {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++)
                System.out.print(matrix[i][j]+ " ");
            System.out.println();
        }
    }
}
