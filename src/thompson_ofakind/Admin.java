/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thompson_ofakind;

import java.util.Scanner;

/**
 *
 * @author Grant Thompson
 * ITDEV 140 THUR EVE
 * ASSIGNMENT 3
 */
public class Admin {
    Scanner scan1 = new Scanner(System.in);
    
    public Admin(){
        DisplayInfo();
    }
    private void DisplayInfo()
        {
            System.out.println("\n\nStudent:\tGrant Thompson");
            System.out.println("Date:\t\t2-12-17");
            System.out.println("Course:\t\t2017 Spring - ITDEV 140 THUR EVE");
            System.out.println("Assignment:\tOf a Kind");
            System.out.println();
            System.out.println();
            System.out.println("Welcome to the Of a Kind game where you can play\n"
                             + "against friends or the computer. Highest of a kind\n"
                             + "wins the match. Most won matches wins the game.");
            System.out.println("\nPress enter key to begin.");
            scan1.nextLine();
        }

}
