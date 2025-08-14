import java.util.ArrayList;
import java.util.Vector;

public class MultiThreadingCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++)
            {
                list.add(i);
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++)
            {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Size of ArrayList : "+list.size());//ArrayList are not Thread safe and will not always return 2000

        Vector<Integer> vlist=new Vector<>();
        Thread t3=new Thread(()->{
            for(int i=0;i<1000;i++)
            {
                vlist.add(i);
            }
        });

        Thread t4=new Thread(()->{
            for(int i=0;i<1000;i++)
            {
                vlist.add(i);
            }
        });

        t3.start();
        t4.start();

        try{
            t3.join();
            t4.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println("Size of Vector : "+vlist.size());//Vectors are thread safe , it will always return 2000
    }
}
