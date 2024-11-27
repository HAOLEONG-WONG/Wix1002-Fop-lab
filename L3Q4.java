/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

/**
 *
 * @author HAOLEONGWONG
 */
import java.util.Random;
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand= new Random();
        int dice1,dice2;
        int player1=0,player2=0;
        int max=6;
        int min=1;
        
        dice1=rand.nextInt(max-min+1)+min;
        player1+=dice1;
        dice1=rand.nextInt(max-min+1)+min;
        player1+=dice1;
        
        dice2=rand.nextInt(max-min+1)+min;
        player2+=dice1;
        dice2=rand.nextInt(max-min+1)+min;
        player2+=dice1;
        
        System.out.println("Score of Player 1: "+player1);
        System.out.println("Score of Player 2: "+player2);
        
        if(player1>player2)
            System.out.println("Player 1 win");
        else if(player2>player1)
            System.out.println("Player 2 win");
        else
            System.out.println("Draw");
  
    }
    
}
