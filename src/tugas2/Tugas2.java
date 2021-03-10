/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas2;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Aria
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner read = new Scanner(System.in);
Random randomNumber = new Random();

int input;
int randomOutput = (int)(Math.random()*100);

System.out.println("Enter a 2 digit number: ");
input = read.nextInt();

int digit1 = input / 10;
int digit2 = input % 10;

int randomNumber1 = randomOutput / 10;
int randomNumber2 = randomOutput % 10;


    if(randomOutput == input)
    {
        System.out.println("Congratulations you won $10,000");
        System.out.println(randomOutput);
    }

    else if(randomNumber1 == digit2 && randomNumber2 == digit1)
    {
        System.out.println("Digits are all the same, you won $3000!\n\n");
        System.out.println("The Lottery Number was " + randomOutput);
    }

    else if(randomNumber1 == digit1 || randomNumber2 == digit2)
    {
        System.out.println("One digit is similar, you won $1000!\n\n");
        System.out.println("The Lottery Number was " + randomOutput);
    }

    else 
    {
        System.out.print("Sorry, but you lost!\n\n");
        System.out.println("The Lottery Number was " + randomOutput);
    }


}

}
