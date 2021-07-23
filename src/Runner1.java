public class Runner1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println(i+" i can run");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
