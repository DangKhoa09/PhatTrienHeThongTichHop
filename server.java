package Socket;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class server {
public static void main(String[] args) {

try {
	ServerSocket server = new ServerSocket(7777);
	System.out.println("Server da duoc tao");
	Socket client = server.accept();
	System.out.println("Client da ket noi den server");
	Scanner inFromClient = new Scanner(client.getInputStream());
	PrintStream outToClient = new PrintStream(client.getOutputStream());
	outToClient.println("Xin chao, ban muon tim sach gi?");
	String name = inFromClient.nextLine();
	System.out.println("client: " + name);
	BufferedReader br= new BufferedReader(new FileReader("‪‪E:\\doc.txt"));// file txt được tạo lưu trong bộ nhớ máy tính 
	String tep=br.readLine();
	if(tep.contains(name))
		outToClient.println("Co sach " + name);
	else
		outToClient.println("Rat tiec khong co sach " + name);
	} catch (IOException e) {
// TODO Auto-generated catch block
		e.printStackTrace();
}
}
}
