/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q5;

/**
 *
 * @author HAOLEONGWONG
 */
import java.util.Scanner;
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,e,f;
        double x,y;
        
        System.out.print("Enter a: ");
        a=sc.nextInt();
        System.out.print("Enter b: ");
        b=sc.nextInt();
        System.out.print("Enter c: ");
        c=sc.nextInt();
        System.out.print("Enter d: ");
        d=sc.nextInt();
        System.out.print("Enter e: ");
        e=sc.nextInt();
        System.out.print("Enter f: ");
        f=sc.nextInt();
        
        x=(e*d-b*f)/(a*d-b*c);
        y=(a*f-e*c)/(a*d-b*c);
        
        if(a*d-b*c==0)
            System.out.println("The equation has no solution");
        else{
             e=a*x+b*y;
             System.out.println("Result of x: "+x);
             f=e*x+d*y;
             System.out.println("Result of y: "+y);
        }
    }
    
}
