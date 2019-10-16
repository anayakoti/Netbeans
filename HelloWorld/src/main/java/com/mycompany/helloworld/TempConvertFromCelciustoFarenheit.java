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
public class TempConvertFromCelciustoFarenheit {
    public static void main(String args[])
    {
     System.out.println("Enter the Celcius vlaue:");
     Scanner userInput=new Scanner(System.in);
     double celcius =userInput.nextDouble();
     double fahrenheit=9.0/5.0*celcius+32;
     System.out.println("The temperature in Fahrenheit is:" +fahrenheit);
     
        
        
        
    }
}
