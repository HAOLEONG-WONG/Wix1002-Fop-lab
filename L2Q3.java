/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

/**
 *
 * @author HAOLEONGWONG
 */
import java.util.Random;
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int max=50;
        int min=10;
        double rand1,rand2,rand3;
        double sum,avg;
      
        rand1=rand.nextInt(max - min + 1) + min;
        rand2=rand.nextInt(max - min + 1) + min;
        rand3=rand.nextInt(max - min + 1) + min;
        
        System.out.println("Random num 1: "+rand1);
        System.out.println("Random num 2: "+rand2);
        System.out.println("Random num 3: "+rand3);
        
        sum=rand1+rand2+rand3;
        System.out.println("Sum of the numbers: "+sum);
        avg=sum/3;
        System.out.printf("Average of the numbers: "+"%.2f%n",avg);
        
    }
    
}
