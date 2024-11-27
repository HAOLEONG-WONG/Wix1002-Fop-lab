/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;

/**
 *
 * @author HAOLEONGWONG
 */
import java.util.Scanner;
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int num1,num2;
       double ans=0;
       char opd;
       
       System.out.print("Enter two integer number: ");
       num1=sc.nextInt();
       num2=sc.nextInt();
       System.out.print("Enter the operant: ");
       opd=sc.next().charAt(0);
       
        switch (opd) {
            case '+':
                ans= num1+num2;
                break;
            case '-':
                ans= num1-num2;
                break;
            case '*':
                ans= num1*num2;
                break;
            case '/':
                ans=num1/num2;
                break;
            case '%':
                ans=num1%num2;
                break;
            default:
                break;
        }
       
       System.out.println(num1+" "+opd+" "+num2+" = "+ ans);


        
    }
    
}
