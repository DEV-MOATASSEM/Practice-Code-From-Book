/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
import java.util.Scanner;
public class sqprime {
    public static void main(String[]args ){
       Scanner scan=new Scanner(System.in);
       //Initializing the Variable
       int h;
       int uprange;
       int dnrange;
       int count=1;

       //Initializing strings to print prime numbers and also their squares
       String  primeNumbers = "",primesquare="";
       /*Taking Input from user for start and end of range whaich takes 
       values from the User*/ 
       System.out.print("Enter the lower range:");
       dnrange=scan.nextInt();
       System.out.print("Enter the upper range:");
       uprange=scan.nextInt();  
        //Loop which takes Input from user
       for (int j=dnrange;j<=uprange;j++){     
           System.out.print("Enter the "+count+" number:");
          //taking input rom user in variable 'h'
           h=scan.nextInt();
           count=count+1;
        int num = h;
        //Variable that 
        int sq=num*num;       
        //Initializing a boolean variable which will help in prime number code 
        boolean Indi = false;
       //code for prime check
        for(int i = 2; i <= num/2; i++)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
              /*As if remainder of num/i is equal to zero that means it is 
                 divisible so not a prime number*/ 
                Indi = true;
                break;
            }
        }

        if (Indi!=true)
            primeNumbers=primeNumbers+num+" ";primesquare=primesquare+(sq)+" ";         
            
        
 }
       //print statements for final output
       System.out.println(primeNumbers+" Are the prime numbers");
       System.out.println(primesquare+" Are the square of the prime numbers");
    }
}
 




