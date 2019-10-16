
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nayak
 */
public class WhileLoop {
    public static void main(String args[])
    {
       Random generator=new Random();
       int diceValue=generator.nextInt(7);
       int count=0;
       while(diceValue!=6){
       System.out.println(diceValue + "is rolled now");
       count++;//Incrementing the Count to know how long it took for the dice to get 6
       diceValue=generator.nextInt(8)+1;
       }
       System.out.println("It took atleast "+count+ " times to get 6 ");
       
   
     
     
    }
    
}
