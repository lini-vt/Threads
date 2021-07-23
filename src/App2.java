import java.util.Scanner;

public class App2 {
    public static void main(String args[]) {
        Processor proc1 = new Processor();
         proc1.start();
         System.out.println("Enter to stop thread");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        proc1.shutDown();
    }
}
