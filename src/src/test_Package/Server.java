/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_Package;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author My PC
 */
public class Server {
    public static final int PORT = 4444;
    
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT,2);
        System.out.println("Server chay");
        System.out.println("Đang chờ người chơi số 1");
        
        Socket socket1 = serverSocket.accept();
        DataOutputStream dos1 = new DataOutputStream(socket1.getOutputStream());
        DataInputStream dis1 = new DataInputStream(socket1.getInputStream());
        
        String player1name = dis1.readUTF();
        dos1.writeUTF("Hello " + player1name + ", I am server. Player 2 is offline, Please wait.");
        
        System.out.println("Server accepted " + player1name);
        System.out.println("Server is waiting for next opponent.");
        
        Socket socket2 = serverSocket.accept();
        DataOutputStream dos2 = new DataOutputStream((socket2.getOutputStream()));
        DataInputStream dis2 = new DataInputStream(socket2.getInputStream());
        
        String player2Name = dis2.readUTF();
        dos2.writeUTF("Hello " + player2Name + ", I am server. Player 1 is online.");
        
        System.out.println("Server accepted " + player2Name);
        
        System.out.println("Sending to players that game can begin...");
        dos1.writeUTF(player1name + ", you can begin to play!");
        dos2.writeUTF(player2Name + ", you can begin to play!");
        
        dos1.writeBoolean(true);
        dos2.writeBoolean(true);
    }
}
