
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
public class DoWhile {
    public static void main(String args[]){
        
    Scanner sc=new Scanner(System.in);
    int dieValue;
    //This loop will keep running until the User gives the Good Value.
    do{
    System.out.println("Please enter a good value:");
    dieValue=sc.nextInt();
    if(dieValue<1)
         {
        System.out.println("Entered value is not Good and is Less than 1 and Please Enter the Number again");
           }
      if(dieValue>6){
        System.out.println("Entered number is greater than 6 and is not a good value");
         }
      else{
          System.out.println("Entered number is a Good value");
      }
    
    
    }while(dieValue<1||dieValue>6);
    }
}

