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
public class Quadratic {
    public static void main (String[]args){
        Scanner scan =new Scanner(System.in);
        int a,b,c;
        double discriminent,root1,root2;
        System.out.print("Enter the co-efficient of x^2:");
        a=scan.nextInt();
        System.out.print("Enter the co-efficient of x:");
        b=scan.nextInt();
        System.out.print("Enter the value of constant:");
        c=scan.nextInt();
        discriminent=Math.pow(b,2)-(4*a*c);
        root1=(-b+Math.sqrt(discriminent))/(2*a);
        root2=(-b-Math.sqrt(discriminent))/(2*a);
        System.out.println("Root No 01: "+root1);
        System.out.println("Root No 02: "+root2);
    }    
}
