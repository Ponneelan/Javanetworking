import java.net.*;
import java.util.Scanner;
import java.io.*;
class Myserver{
public static void main(String []args){
    String msg="";;
    
        try{
            ServerSocket ss= new ServerSocket(1111);
            Socket s=ss.accept(); 
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            Scanner in =new Scanner(System.in);
            while(!msg.equals("no")){

            String str= (String)dis.readUTF();
            System.out.println(str);
            String var=in.nextLine();
            dout.writeUTF(var);
            msg=str;
            
            }
            if (msg.equals("no")){
                ss.close();
                s.close();
            }
            
            }
            catch(Exception e){
            System.out.println("Error"+e);
            }
    



}
}
