/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

/**
 *
 * @author nayak
 */
public class WineGlass {
    public static void main(String args[]){
        int firstNumber=12;
        int secondNumber=13;
        int thirdNumber;
        //Wine glass approach of assigining
        thirdNumber=secondNumber;
        secondNumber=firstNumber;
        firstNumber=thirdNumber;
      System.out.println("First="+" "+firstNumber+ "Second="+" "+secondNumber);
        
        
    }
    
}
