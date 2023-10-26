/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivity;

/**
 *
 * @author L15Y13W03
 */
public class Activity17 {
    public static void main(String[] args){
        int item = 5;
        for(int i = 1; i <= item; i++){
            for(int j = 1; j <= item - i; j++)
                System.out.print(" ");
            for(int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        
        for(int i = item-1; i >= 1; i--){
            for(int j = 1; j <= item - i; j++)
                System.out.print(" ");
            for(int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/