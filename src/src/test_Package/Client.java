/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_Package;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author My PC
 */
public class Client {
    private static double x;
    private static double y;
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost",4444);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        
        System.out.println("Hello user. Enter your name: ");
        String name = scanner.nextLine();
        dos.writeUTF(name);
        
        String serverMessage = dis.readUTF();
        System.out.println(serverMessage);
        
        String tmpReader = dis.readUTF();
        System.out.println(tmpReader);
        
        boolean tmpReader2 = dis.readBoolean();
        if(tmpReader2){
            
        }
        else{
            return;
        }
        while(true){
            Thread.sleep(50);
        }
    }
}
