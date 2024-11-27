/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q1;

/**
 *
 * @author HAOLEONGWONG
 */
import java.util.Scanner;
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        
        System.out.print("Enter an integer : ");
        num=sc.nextInt();
        
        System.out.print("The factors are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0&&i!=num)
                System.out.print(i+", ");
            else if(num%i==0&&i==num)
                System.out.println(i);
        }
    }
    
}
