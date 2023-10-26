/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivity;
import java.util.Scanner;
/**
 *
 * @author L15Y13W03
 */
public class Activity9 {
    public static char getChar(Scanner eeban){
        System.out.print("Enter a letter: ");
        
        return eeban.next().charAt(0);
    }
    
    public static void charType(char a){
        switch(a){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.print("The letter " + a + " is a Vowel.");
                break;
            case 'b':
            case 'B':
            case 'c':
            case 'C':
            case 'd':
            case 'D':
            case 'f':
            case 'F':
            case 'g':
            case 'G':
            case 'h':
            case 'H':
            case 'j':
            case 'J':
            case 'k':
            case 'K':
            case 'l':
            case 'L':
            case 'm':
            case 'M':
            case 'n':
            case 'N':
            case 'p':
            case 'P':
            case 'q':
            case 'Q':
            case 'r':
            case 'R':
            case 's':
            case 'S':
            case 't':
            case 'T':
            case 'v':
            case 'V':
            case 'w':
            case 'W':
            case 'x':
            case 'X':
            case 'y':
            case 'Y':
            case 'z':
            case 'Z':
                System.out.print("The letter " + a + " is a Consonant.");
                break;
            default:
                System.out.print("Invalid input.");
        }
    }
    
    public static void main(String[] args){
        Scanner eeban = new Scanner(System.in);
        char a = getChar(eeban);
        charType(a);
        eeban.close();
    }
}
