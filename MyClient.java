package socket;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) {
		
		try {
			Socket client = new Socket("LocalHost", 6789);//id host
			System.out.println("Client da duoc tao");
			Scanner inFromServer = new Scanner(client.getInputStream());
			PrintStream outToServer = new PrintStream(client.getOutputStream());
			System.out.println("server: " + inFromServer.nextLine());
			Scanner scan = new Scanner(System.in);
			String a = scan.nextLine();
			outToServer.println(a);
			System.out.println("server: " + inFromServer.nextLine());//xuat chuoi ra man hinh va chuoi bi dao nguoc
			} catch (UnknownHostException e) {
			
			e.printStackTrace();
			} catch (IOException e) {
			
			e.printStackTrace();
			}
	}

}

