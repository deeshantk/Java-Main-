import java.io.*;
import java.net.*;

public class Server{
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
            System.out.println("Online");
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "", str2 = "";
            while(!str.equals("bye")){
                str = din.readUTF();
                System.out.println("Client: " + str);
                str2 = br.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }
            din.close();
            ss.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
