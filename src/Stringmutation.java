/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOATASSEM SINDHU
 */

public class Stringmutation {
public static void main(String[]args){
    String Stat;
    Stat=("Moatassem Fuck the world");
    String m1,m2,m3,m4;
    System.out.println("Orignal Statement \""+Stat+"\"");
    System.out.println(Stat.length());
    m1=Stat.concat(" Just do it...");
    m2=m1.toUpperCase();
    m3=m2.replace('F', 'L');
    m4=m3.substring(10, 30);
    System.out.println("Mutation #1: " + m1);
System.out.println("Mutation #2: " + m2);
System.out.println("Mutation #3: " + m3);
System.out.println("Mutation #4: " + m4);
System.out.println("Mutated length: " + m4.length());


String s1 = "Foundations";
String s2;
System.out.println(s1.charAt(1));
s2 = s1.substring(0, 5);
System.out.println(s2);
System.out.println(s1.length());
System.out.println(s2.length());
}    
}
