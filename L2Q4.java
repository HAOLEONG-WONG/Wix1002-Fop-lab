/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

/**
 *
 * @author HAOLEONGWONG
 */
import java.util.Scanner;
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int seconds;
        int h,m,s;
        
        System.out.print("Enter the number of seconds: ");
        seconds=sc.nextInt();
        
        h=seconds/60/60;
        m= (seconds-(h*60*60))/60;
        s= seconds-(h*60*60)-(m*60);
        
        System.out.println(seconds+" seconds is "+h+ " hours, "+m+" minutes and "+s+ " seconds");
        
        
        
    }
    
}
