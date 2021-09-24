/**
 * client
 */

import java.util.*;
import java.io.*;
import java.net.*;
public class client {
public static void main(String[] args) {
    try {
        Socket s = new Socket("192.168.0.107",3333);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Message : ");
        String msg =sc.nextLine();
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(msg);
        dout.flush();
        dout.close();
        s.close();
    } 
    catch (Exception e) {
        System.out.println(e);
    }
}
}