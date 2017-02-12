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
public class Winner {
    
    private int roundWinnerPlayer=-1;
    private String roundWinnerName="";

    public Winner(int roundWinnerPlayer, String roundWinnerName) {
        
        this.roundWinnerPlayer=roundWinnerPlayer;
        this.roundWinnerName=roundWinnerName;
    }
    
     public Winner( String roundWinnerName) {
        
        this.roundWinnerName=roundWinnerName;
    }

    public Winner(int roundWinnerPlayer) {
        this.roundWinnerPlayer=roundWinnerPlayer;
    }
     
     

    public int getRoundWinnerPlayer() {
        return roundWinnerPlayer;
    }

    public void setRoundWinnerPlayer(int roundWinnerPlayer) {
        this.roundWinnerPlayer = roundWinnerPlayer;
    }

    public String getRoundWinnerName() {
        return roundWinnerName;
    }

    public void setRoundWinnerName(String roundWinnerName) {
        this.roundWinnerName = roundWinnerName;
    }

    
    
    
}
