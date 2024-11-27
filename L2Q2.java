/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

/**
 *
 * @author HAOLEONGWONG
 */
import java.util.Scanner;
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        double p,d,r,y,m;
        System.out.print("Enter the price of car: RM");
        p=sc.nextDouble();       
        System.out.print("Down payment: RM");
        d=sc.nextDouble();       
        System.out.print("Interest Rate in %:");
        r=sc.nextDouble();       
        System.out.print("Loan duration in year: ");
        y=sc.nextDouble();       
        
        m=(p-d)*(1+r*y/100)/(y*12);
        
        System.out.printf("Monthly payment:RM "+"%.2f%n",m);
        
    }
    
}
