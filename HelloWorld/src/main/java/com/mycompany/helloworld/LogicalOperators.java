/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

import java.util.Scanner;

/**
 *
 * @author nayak
 */
public class LogicalOperators {
    public static void main (String args[]){
        //Take the UserInput
        System.out.println("How old are you?");
        Scanner ageInput=new Scanner(System.in);
        int ageVerify=ageInput.nextInt();
        //Testing for Smoking
        if(ageVerify>=18)
        {
            System.out.println("Customer is Old enough to Smoke only");
            
        }
       
        
        if(ageVerify>=21){
            System.out.println("Customer is not only Old enough to Smoke but also to Drink");
        }
    
        if((ageVerify<21)&&(ageVerify<18)){
            System.out.println("Customer cannot Smoke or Drink Lawfully");
        }
        
        
    }
    
}
