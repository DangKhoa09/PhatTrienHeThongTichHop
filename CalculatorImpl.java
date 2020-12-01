import java.rmi.*;

public class CalculatorImpl implements Calculator{
    public int addNum(int x, int y) throws RemoteException{
        System.out.println("Client request to calculate");
        return (x+y);
    }
}
