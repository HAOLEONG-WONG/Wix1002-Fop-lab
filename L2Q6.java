/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double g,m,t1,t2,q,c1,c2;
        
        System.out.print("Enter the amount of water in gram: ");
        g=sc.nextDouble();
        m=g/1000;
       
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        t1=sc.nextDouble();
        c1=(t1-32)/1.8;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        t2=sc.nextDouble();
        c2=(t2-32)/1.8;
        
        q=m*(c2-c1)*4184;
        
        NumberFormat scientificFormat = new DecimalFormat("0.######E00");
        String scientificNotation= scientificFormat.format(q);
        System.out.println("The energy needed is "+scientificNotation);
        
        
    }
    
}
