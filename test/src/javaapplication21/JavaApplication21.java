/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Strengol
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //napiszmy sobie jakas testowa petle
        
        int k = 0;
        float suma;
        
        Scanner in = new Scanner( System.in );
        Scanner we = new Scanner ( System.in );
        
        do{
           System.out.println( " Podaj znak *,-,+,/" );
           char znak = in.next().charAt(0);
           System.out.println("Podaj pierwszą liczbę");
           float a = we.nextFloat();
           System.out.println(" Podaj drugą liczbę ");
           float b = we.nextFloat();
           switch(znak){
               case '+': suma = a + b;
                    System.out.println(a+"+"+b+"="+suma);
                    break;
               case '-': 
                    System.out.println(a+"-"+b+"="+(a-b));
                    break;
               case '*':
                    System.out.println(a+"*"+b+"="+(a*b));
                    break;
               case '/':
                    if(b != 0){
                        System.out.println(a+"/"+b+"="+(a/b));
                    }else{
                        System.out.println( " nie dzielimy przez 0");
                    }
                    break;
           }
           System.out.println("kontynuowac? 1= nie, 0=tak");
           k=we.nextInt();
        }
        while(k!=1);
        }
    }
    

