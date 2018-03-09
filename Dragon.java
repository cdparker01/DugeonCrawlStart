/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DungeonCrawlStart;

import static DungeonCrawlStart.Dungeon.dungeon;
import java.util.Scanner;

/**
 * The Dragon class creates a "Dragon" for the hero to encounter and fight
 *
 * @author chandlerparker
 */
public class Dragon extends Being
{
    public int health = 100;
    public int Strength = 200;
    public int breathFire = 500;
    
    /**
    * This method is the encounter between the hero and the dragon. 
    * Gives the user 2 options to choose between to attack or defend
    *
    * @Param Hero h
    * @param Dungeon d
    */
    public int breathFireAttack(Hero h, Dungeon d)
    {
       System.out.println("The Dragon is about to breath fire. What will you do? 1 = dodge, 2 = defend");
       Scanner scan = new Scanner(System.in);
       int input = scan.nextInt();
       if(input == 1)
       {
           System.out.println("The hero attempts to dodge the Dragons fire");
           System.out.println("The dragons fire misses and causes the room to callapses and kills the dragon");
           dungeon[d.heroSpot + 1] = null;
           return this.health = 0;
       }
       else if(input == 2)
       {
           System.out.println("The hero tried to defend against the fire but he is only human");
           dungeon[d.heroSpot] = null;
           return h.health = h.health - this.breathFire;
       }
        return 0;            
    }
    /**
    * Short print method to print out a graphic of a dragon
    *
    */
    public void emoticonDragon()
    {
        System.out.println("                 ___====-_  _-====___");
        System.out.println("           _--^^^#####//      \\\\#####^^^--_");
        System.out.println("        _-^##########// (    ) \\\\##########^-_");
        System.out.println("       -############//  |\\^^/|  \\\\############-");
        System.out.println("     _/############//   (@::@)   \\\\############\\_");
        System.out.println("    /#############((     \\\\//     ))#############\\");
        System.out.println("   -###############\\\\    (oo)    //###############-");
        System.out.println("  -#################\\\\  / VV \\  //#################-");
        System.out.println(" -###################\\\\/      \\//###################-");
        System.out.println("_#/|##########/\\######(   /\\   )######/\\##########|\\#_");
        System.out.println("|/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|");
        System.out.println("`  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '");
        System.out.println("   `   `  `      `   / | |  | | \\   '      '  '   '");
        System.out.println("                    (  | |  | |  )");
        System.out.println("                   __\\ | |  | | /__");
        System.out.println("                  (vvv(VVV)(VVV)vvv)");
    }
   

}
