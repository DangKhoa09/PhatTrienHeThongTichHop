package Socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class client {
public static void main(String[] args) {
try {
	Socket client = new Socket("LocalHost",7777 );
	System.out.println("Client da duoc tao");
	Scanner inFromServer = new Scanner(client.getInputStream());
	PrintStream outToServer = new PrintStream(client.getOutputStream());
	System.out.println("server: " + inFromServer.nextLine());
	Scanner scanner = new Scanner(System.in);
	String tens = scanner.nextLine();
	outToServer.println(tens);
	System.out.println(" server: " + inFromServer.nextLine());//in ten cua sach tim duoc
	} catch (UnknownHostException e) {

		e.printStackTrace();
	} catch (IOException e) {

		e.printStackTrace();
}
}
}
