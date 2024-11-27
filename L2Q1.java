/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;

/**
 *
 * @author HAOLEONGWONG
 */
import java.util.Scanner;
public class L2Q1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
        
        double c,f;
        System.out.print("Enter temperature in degree Fahrenheit: ");
        f=sc.nextDouble();
        c=(f-32)/1.8;
        
        System.out.printf("Temperature in degree celcius: "+"%.2f%n",c);
        
        
    }
    
}
