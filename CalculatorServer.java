import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;
public class CalculatorServer {
  public static void main(String[] args) {
    try {
        int port = 8889;
	LocateRegistry.createRegistry(port);
        CalculatorImpl c = new CalculatorImpl();
        System.out.println("Expoting Calculator...");

        UnicastRemoteObject.exportObject(c,port);
        Naming.bind("rmi://localhost/MyCalculator2", c);
        System.out.println("Register Calculator!!");
    } catch (Exception e) {
        System.out.println(e);
    }  
    

  }
}
