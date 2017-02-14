/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thompson_ofakind;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Grant Thompson
 * ITDEV 140 THUR EVE
 * ASSIGNMENT 3
 */
public class Controller {

    Player_UI player_UI_1;
    Scanner scan1 = new Scanner(System.in);
    Calc calc_1 = new Calc();
    ArrayList<Player> player = new ArrayList<>();
    
    
    public Controller() {
        
        playGame();
        
    }

    private void playGame() {
        String playAgain;
        int numberOfPlayers;
        
        
        System.out.println(" If you enter 1 player you will be matched\n"
                        + "with the computer. Otherwise you'll be match only\n"
                        + "with your friends if players is greater than 1.\n");
        
        
        
        do {       //begin game loop
            
            System.out.print("How many players are there? > ");
            numberOfPlayers = Integer.parseInt(scan1.next());
            player.removeAll(player);
            player_UI_1 = new Player_UI(numberOfPlayers, scan1, player, calc_1);
            
            System.out.println("Would you like to play again? y:n > ");
            playAgain = scan1.next();
            
            
        } while (playAgain.equals("y") || playAgain.equals(""));
    }
    
}
