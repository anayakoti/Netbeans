/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testthreestatesofwater;

import java.util.Scanner;

/**
 *
 * @author nayak
 */
public class WaterState {
    public static void main(String args[]){
        //Taking the user Input
        System.out.println("Enter the temperature value:");
        Scanner UserInput=new Scanner(System.in);
        int temperature=UserInput.nextInt();
        //Here comes the logic to check
        if(temperature>=100){
            System.out.println("Water has reached the Boiling Point");
        }
          
        else if(temperature<0){
                    System.out.println("Water is at Freezing Point");
                    }
        else{
            System.out.println("Water is at Normal State");
                    }
        }
    }

