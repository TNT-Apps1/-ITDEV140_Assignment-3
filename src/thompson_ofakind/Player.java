/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thompson_ofakind;

/**
 *
 * @author Grant Thompson
 * ITDEV 140 THUR EVE
 * ASSIGNMENT 3
 */
public class Player {
    
    private String name;
    int gamesWon;
    int[][] gameScores = new int[10][5];
    

    public String getName() {
        return name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon() {
        this.gamesWon = (this.gamesWon+1);
    }

    

    public Player(String name) {
        this.name = name;
    }

    public int[] getGameScore(int gameNumber) {
        int[] tempGameScore = new int[5];
        tempGameScore= gameScores[gameNumber];
        
                return tempGameScore;
    }
    
    
    
    public void setScore(int gameNumber, int[] gamescore){
        
        for (int i =0; i<gamescore.length;i++) {
            
            gameScores[gameNumber][i]=gamescore[i];
            
        }
        
    }
    
    
    
}
