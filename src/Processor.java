public class Processor extends Thread{
    private boolean running = true;
    public void run(){
        while(running){
            System.out.println("hello");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void shutDown(){
        running = false;
    }
}

