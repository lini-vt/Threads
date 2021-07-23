public class App1 {

    public static void main(String args[]) {
        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Thread(new Runner1());
        t1.start();
        t2.start();
    }
}
