/**
 * server
 */
import java.io.*;
import java.net.*;
public class server {
public static void main(String[] args) {
    try {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String msg = (String)dis.readUTF();
        System.out.println("Client : "+msg);
        ss.close();
    } 
    catch (Exception e) {
        System.out.println(e);
    }
}
}