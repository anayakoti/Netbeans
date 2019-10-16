/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.boilingpointtest;

import java.util.Scanner;

/**
 *
 * @author nayak
 */
public class ConditiontCheckIfInpIisBoilingOrNot {
    public static void main(String args[]){
        System.out.println("Enter the CelCius Value");
        Scanner UserInput=new Scanner(System.in);
        int celcius=UserInput.nextInt();
        //Testing if the Temperatire is above boiling Point or not
        if(celcius>=100){
            System.out.println("The temperature input has reaced the Boiling Point");
            
        }
        else{
            System.out.println("The temperature input has not reached the Boiling Point");
        }
        
    }
}
