/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keepguessing;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class KeepGuessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int randomNum, userInput;
        randomNum = 1 + r.nextInt(10);
        
        System.out.print("I'm thinking of a number between 1-10, try and guess \n" + " your guess: ");
        userInput = keyboard.nextInt();
        
        while(userInput != randomNum){
            System.out.print("That is incorrect! Try again\n " + "your guess: " );
            randomNum = keyboard.nextInt();
           
        }
        System.out.println("That's right! You're a good guesser. ");
    }
    
}
