/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DungeonCrawlStart;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author chandlerparker
 */
public class Client 
{
    public static void main(String[] args) throws UnknownHostException, IOException
    {
        int number,temp;
        Scanner scan = new Scanner(System.in);
        Socket s = new Socket("2601:543:102:89d9:1de:fd56:4018:cb1a", 3000);
        
        Scanner scan2 = new Scanner(s.getInputStream());
        System.out.println("Enter a 1 to start:");
        number = scan.nextInt();
        
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(number);
        temp = scan2.nextInt();
        System.out.println(temp);
    }
}
