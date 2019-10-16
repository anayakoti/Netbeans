
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nayak
 */
public class RandomNumbers {
    public static void main(String args[]){
    
    Random dice=new Random();
    int randomNumber=dice.nextInt(40);//Random number is stored and specified the range as well.
   System.out.println("Here is the Random number that we have generated: ");
   System.out.println(randomNumber);
  
    }
    
}
