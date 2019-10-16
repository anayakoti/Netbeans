
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
public class getNumber17 {
    public static void main(String args[]){
        Random generator=new Random();
        int diceValue=generator.nextInt(50);//Among the 50 chances how many times it takes to get 17
        int count=0;
        while(diceValue!=17){
            System.out.println(+diceValue+ "Has been rolled");
            count++;
           diceValue=generator.nextInt(50)+1;//We are generating a random number again if it's not 17
        
        }
        
        System.out.println("It took"+count+"times to get:"+diceValue);        
        
    }
    
}
