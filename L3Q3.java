/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

/**
 *
 * @author HAOLEONGWONG
 */
import java.util.Scanner;
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int sv;
        double com=0;
        
        System.out.print("Sales volume: ");
        sv=sc.nextInt();
        
        if(sv<=100)
            com=sv*0.05;
        else if(sv>100&&sv<=500)
            com=sv*0.075;
        else if(sv>500&&sv<=1000)
            com=sv*0.10;
        else if(sv>1000)
            com=sv*0.125;
        
        System.out.printf("Commission: "+"%.2f\n",com);
        
        
    }
    
}
