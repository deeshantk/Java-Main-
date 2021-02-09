import java.io.*;
import java.net.*;
public class Client{
    public static void main(String[] args){
        try{
            Socket s = new Socket("192.168.1.102", 8080);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){a
            System.out.println(e);
        }
    }
}
