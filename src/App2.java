import java.util.Scanner;

public class App2 {
    private int count =0;
    public static void main(String args[]) {
        /*Processor proc1 = new Processor();
         proc1.start();
         System.out.println("Enter to stop thread");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        proc1.shutDown();*/

        App2 app = new App2();
        app.doWork();

    }
    public synchronized void increment(){
        count++;
    }
    public void doWork(){
        Thread t1= new Thread(new Runnable(){
            public void run(){
                for (int i=0;i<6;i++){
                    increment();
                    System.out.println("thread1");
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                for (int i=0;i<6;i++){
                    increment();
                    System.out.println("thread2");
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(count+"count");

    }
}
