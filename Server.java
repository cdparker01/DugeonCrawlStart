/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DungeonCrawlStart;

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
        int number,temp;
        ServerSocket ser = new ServerSocket(3000);
        Socket ss = ser.accept();
        System.out.println("Connected");
        
        Scanner scan = new Scanner(ss.getInputStream());
        number = scan.nextInt();
        
        temp = number + 2; //Manipulated input
        
        PrintStream ps = new PrintStream(ss.getOutputStream());
        ps.println(temp); // printed manipulated output
        
    }
}
