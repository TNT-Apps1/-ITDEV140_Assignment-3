/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thompson_ofakind;

import java.util.Random;

/**
 *
 * @author Grant Thompson
 * ITDEV 140 THUR EVE
 * ASSIGNMENT 3
 */
public class Dice {
    
    int[]fiveDie = new int[5];
    
    
    public Dice(){
        
    }
    
    public int[] rollDice(){//get 5 random die between 1 & 6 to array
        
        Random random_1 = new Random();
        
        for (int i = 0; i < fiveDie.length; i++) {
            
            fiveDie[i]=random_1.nextInt(6)+1;
            
            
        }
        
        return fiveDie;
    }
    
    
}
