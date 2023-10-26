/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivity;

/**
 *
 * @author L15Y13W03
 */
import java.util.Scanner;

public class Activity16 {
    public static void main(String[] args){
        Scanner eeban = new Scanner(System.in);
        int rows;
        String dis;
        
        System.out.print("Enter Number of Rows: ");
        rows = eeban.nextInt();
        eeban.nextLine();
        System.out.print("Enter String Output: ");
        dis = eeban.nextLine();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i+1; j++)
                System.out.print(dis + " ");
           System.out.println();
        }
    }
}
