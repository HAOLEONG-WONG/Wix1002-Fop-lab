/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;

/**
 *
 * @author HAOLEONGWONG
 */
import java.util.Scanner;
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double r,x,y;
        boolean circle;
        System.out.print("Enter the radius: ");
        r=sc.nextDouble();
        System.out.print("Enter the x: ");
        x=sc.nextDouble();
        System.out.print("Enter the y: ");
        y=sc.nextDouble();
        
        circle=Math.sqrt(Math.pow(x,2)+Math.pow(y,2))<=r;
        System.out.println("Point (" + x + ", "+ y + ") is " + ((circle) ? "in " : "not in ") + "the circle"); 
    }
    
}
