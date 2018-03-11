/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DungeonCrawlStart;

import static DungeonCrawlStart.Test.dungeon;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author chandlerparker
 */
public class Server 
{
    public static void main(String[] args) throws IOException
    {
        Dungeon d = new Dungeon();
        Monster m = new Monster();
        Hero h = new Hero();
        TrappedTreasure t = new TrappedTreasure();
        Potions p = new Potions();
        Dragon dra = new Dragon();
        
        int number,temp;
        ServerSocket ser = new ServerSocket(3000);
        Socket ss = ser.accept();
        System.out.println("Connected");
        
        Scanner scan = new Scanner(ss.getInputStream());
        number = scan.nextInt();
        PrintStream ps = new PrintStream(ss.getOutputStream());
        
        if(number == 1)
        {
            d.createDungeon(m,h,t,p,dra);



            while(d.heroSpot != dungeon.length - 1 && h.health > 0)
            {   
                Scanner scan3 = new Scanner(System.in);
                int input = scan3.nextInt();
                String opp = scan3.nextLine();

                if(input == 1)
                { 
                    ps.println("\nHero moves Forward");
                    d.moveHero(input,t,h,p,dra,m);

                }
                else
                {
                    ps.println("Error wrong key entered");
                }

                ps.println("\nEnter 1 to move Forward:");
            }

            if(h.health > 0)
            {
                ps.println("\nYOU WIN! The Hero finished the dungeon");
                h.emtoHero();
            }
            else
            {
                ps.println("\nGAME OVER: The Hero was killed");
                Test.end();
            }

        }
  }
        
       
        //ps.println(temp); // printed manipulated output
        
}


