/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thompson_ofakind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Grant Thompson
 * ITDEV 140 THUR EVE
 * ASSIGNMENT 3
 */
public class Player_UI {
    
        private int numberOfPlayers = 0;
        ArrayList<Player> player;
        Scanner scan1;
        Dice dice = new Dice();
        Calc calc_1;
            
    
     //begin properties setter getters
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        
    }
    //end properties setter getters
    
    
    public Player_UI(int numberOfPlayers, Scanner scan1, ArrayList<Player> player, Calc calc_1) {
        
        this.numberOfPlayers = numberOfPlayers;
        this.scan1=scan1;
        this.player = player;
        this.calc_1=calc_1;
        getNames();
        beginGame();
        getWinner();
    }//end constructor

    private void getNames() {
        
        String tempName;
        
       
        for (int i = 0; i < numberOfPlayers; i++) {//get players names and add them to the arraylist
            System.out.printf("Player %s, please enter your name. > ", (i+1));
            tempName = scan1.next();
            player.add(new Player(tempName));
            
        }
        if(numberOfPlayers==1){// if # of players = 1 add computer as opponent to arraylist
            player.add(new Player("Computer"));
            System.out.println("Computer is Player "+ player.size());
        }
        System.out.println("Let's Begin.");
        
        
    }//end getNames()

    private void beginGame() {
        
        int[] tempDice;
        int tempSize = player.size();
        
        for(int i =0; i<10;i++){
            
            for(int j =0; j<tempSize;j++){
            System.out.printf("%n%s, please press enter to roll your dice.",player.get(j).getName());
            scan1.nextLine();
            //if(player.get(j).getName().equals("Computer"))
            if(i==0&&j==0)
                scan1.nextLine();
            tempDice = dice.rollDice();
            System.out.printf("%d - %d - %d - %d - %d%n",tempDice[0],tempDice[1],tempDice[2],tempDice[3],tempDice[4]);
            player.get(j).setScore(i, tempDice);
        }//end inner for loop
            
            calc_1.doRoundWinner(i, tempSize, player);
            
            System.out.print("\n\n*******************************");
            
            if(calc_1.getWinnersListSize()==0){
                System.out.printf("%nNo 'dice Of a Kind'", (i+1));
            }else if(calc_1.getWinnersListSize()!=player.size()){
                for(int k = 0; k<calc_1.getWinnersListSize(); k++)
                    System.out.printf(calc_1.getMtachWinners(k));
            }else{
                System.out.printf("%nMatch #%d is a draw.%nEach get a point.", (i+1));
            }
            
            System.out.print("\n*******************************\n\n");
            
        }//end outer for loop
    }//end beginGame()
    
    
    

    private void getWinner(){
        
        Collections.sort(player);//sort by descending order of won matches performed in Players class
        
        Admin.doPause(1000);
        System.out.println("Calculating the game winner........");
        Admin.doPause(2000);
        
        if(calc_1.getQtyOfWinners()==player.size()){
            System.out.print("\n\n*******************************");
                System.out.print("\nGame is a draw!");
                System.out.print("\n*******************************\n\n");
        }else{
            int highScore=calc_1.getGameWinner(player);
            
            for (int i = 0; i < player.size(); i++) {
            if(player.get(i).getGamesWon()==highScore){
                System.out.print("\n\n*******************************");
                System.out.printf("%n%s is the Game winner! w/ %d matches.", player.get(i).getName(), player.get(i).getGamesWon());
                System.out.print("\n*******************************\n\n");
            }else{
                System.out.printf("*%s only won %d matches%n", player.get(i).getName(), player.get(i).getGamesWon());
            }
                
        }
        }
        System.out.printf("%n%n");
        
        
        
    }//end getWinner()

    

    
    
    
}//end Class
