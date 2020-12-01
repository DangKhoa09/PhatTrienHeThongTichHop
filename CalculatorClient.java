import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            System.out.println("Finding object...");
            Calculator c = (Calculator)Naming.lookup("rmi://localhost/MyCalculator2");
            System.out.println(c.addNum(12, 13));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
