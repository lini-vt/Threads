import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
    Random random = new Random();
    private  List<Integer> list1 = new ArrayList<Integer>();
    private  List<Integer> list2 = new ArrayList<Integer>();

    public void stageOne(){
        try{
            Thread.sleep(1);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        list1.add(random.nextInt(100));
    }
    public void stageTwo(){
        try{
            Thread.sleep(1);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
    }
    public void process(){
        for(int i=0;i<10;i++){
            stageOne();
            stageTwo();
        }
    }

    public static void main(String args[]){
        System.out.println("Starting .......");

        long start=System.currentTimeMillis();
        long end = System.currentTimeMillis();
        Worker work = new Worker();
        work.process();
        System.out.println("Time taken : "+(end-start));
        System.out.println("List 1"+work.list1.size());
        System.out.println("List 2"+work.list2.size());

    }

}
