/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

import java.util.Random;

public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random r=new Random();   
       
       int min=0;
       int max=10000;
       int rand1;
       int lastDigit;
       
       rand1=r.nextInt(max -min + 1)+min ;
       System.out.println("The number: "+ rand1);
       
       int sum=0;
       while(rand1!=0){
            lastDigit= rand1%10;
            sum+= lastDigit;
            rand1=rand1/10;
             
       }
       System.out.println(sum);
     
       
    }
    
}
