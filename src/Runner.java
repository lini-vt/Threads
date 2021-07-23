public class Runner extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println(i+"funny i can run");
            try{
            Thread.sleep(100);
        }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
