/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */
import java.util.Random;
public class random_class {
        public static void main (String[]args){
        Random generator=new Random();
        int num1;
        float num2;
        num1=generator.nextInt();
        System.out.println("Random number :"+num1);
                num1=generator.nextInt(10)+11;
        System.out.println("Random number b/w 11-20 :"+num1);
                num1=generator.nextInt(10);
        System.out.println("Random number b/w 0-9:"+num1);
                num1=generator.nextInt(15)+30;
        System.out.println("Random number b/w 30-44:"+num1);
                num1=generator.nextInt(50)-50;
        System.out.println("Random number b/w -50 to -1:"+num1);
                num2=generator.nextFloat();
        System.out.println("Random number b/w 0-0.9999... :"+num2);
                num2=generator.nextFloat()*9;
        System.out.println("Random number b/w 0.0-8.999...:"+num2);
    }
    
}
