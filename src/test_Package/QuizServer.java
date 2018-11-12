/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_Package;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


/**
 *
 * @author My PC
 */
public class QuizServer {
    public final static int SERVER_PORT = 117;
    public final static byte[] BUFFER = new byte[4096];
    static int countplayer = 0;
    public static void main(String[] args) {
        DatagramSocket ds = null;
        System.out.println("Server started ");
        System.out.println("Đang chờ người chơi kết nối.");
        
        while(countplayer < 2){
            try{
                ds = new DatagramSocket(SERVER_PORT);
                    DatagramPacket incoming = new DatagramPacket(BUFFER, BUFFER.length);
                    ds.receive(incoming);

                    String message = new String(incoming.getData(), 0, incoming.getLength());
                    System.out.println(message + " đã kết nối vào game");countplayer++;

                    DatagramPacket outsending = new DatagramPacket(message.getBytes(), incoming.getLength(),
                        incoming.getAddress(), incoming.getPort());
                    ds.send(outsending);
            
            }catch(IOException e){
                e.printStackTrace();
            }
            finally{
                if(ds != null){
                    ds.close();
                }
            }            
        }
        System.out.println("Trờ chơi bây giờ có thể bắt đầu");
    }
}
