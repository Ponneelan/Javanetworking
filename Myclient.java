import java.io.*;
import java.net.*;
import java.util.Scanner;
 class Myclient{
 public static void main(String []args){
     String msg="";
     
        try{
            Socket cs=new Socket("localhost",1111);
            DataOutputStream dout=new DataOutputStream(cs.getOutputStream());
            DataInputStream dis=new DataInputStream(cs.getInputStream());
            Scanner in=new Scanner(System.in);
            //dout.writeUTF("Hello server");
            
            while(!msg.equals("no")){
                //System.out.println("\n To Server :");
                String txt=in.nextLine();
                dout.writeUTF(txt);
                String var=(String)dis.readUTF();
                System.out.println(var);
                msg=txt;
                dout.flush();
            }
            if (msg.equals("no")){
                cs.close();
                //s.close();
            }
            
            
            
            }
            catch(Exception e){
            System.out.println(e);
            }
     
 
 }
 }
