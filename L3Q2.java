/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q2;

/**
 *
 * @author HAOLEONGWONG
 */
import java.util.Random;
public class L3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand=new Random();
        int max=5;
        int min=0;
        int r1;
        String word="";
        
        r1=rand.nextInt(max-min+1)+min;
        
        switch(r1){
            case 0:
                word="zero";
                break;
            case 1:
                word="one";
                break;
            case 2:
                word="two";
                break;
            case 3:
                word="three";
                break;
            case 4:
                word="four";
                break;
            case 5:
                word="five";
                break; 
        }       
        System.out.println(r1+" is "+word);
    }
    
}
