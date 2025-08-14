import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListCollection {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> shoppingList=new CopyOnWriteArrayList<>();
        /*
        * "Copy on Write" means that whenever a write operation like
        * add or removing an element , instead of directly modifying
        * the existing list , a new copy of list is created  and modification
        * is applied to that list .
        * This insures that other threads reading the list while it's being modified
        * are unaffected .
        */
        
        //Read Operations : Fast and direct, since they happen on stable list without interference from modifications.
        /*Write Operations : A new copy of the list is created for every modification.
                             The reference to the list is then updated so that subsequent reads use this new list.
        */

//        List<String> shoppingList=new ArrayList<>();
//        shoppingList.add("eggs");
//        shoppingList.add("bread");
//        shoppingList.add("milk");
//        System.out.println(shoppingList);
//
//        for(String item : shoppingList)
//        {
//            System.out.println(item);
//            if (item.equals("eggs")) {
//                shoppingList.add("butter");//this will give ConcurrentModificationException
//                System.out.println("added butter while reading");
//            }
//        }
//        System.out.println("Updated shopping list : "+shoppingList);

        shoppingList.add("eggs");
        shoppingList.add("bread");
        shoppingList.add("milk");
        System.out.println("Initial shopping list : "+shoppingList);

        for(String item : shoppingList)
        {
            System.out.println(item);
            if (item.equals("eggs")) {
                shoppingList.add("butter");
                System.out.println("added butter while reading");
            }
        }
        System.out.println("Updated shopping list : "+shoppingList);

        List<String> sharedList=new CopyOnWriteArrayList<>();
        // List<String> sharedList=new ArrayList<>(); would give ConcurrentModificationException as ArrayList does not allow concurrent modification.
        sharedList.add("item1");
        sharedList.add("item2");
        sharedList.add("item3");

        Thread readerThread = new Thread(()-> {
            try{
                while (true){
                    for(String item : sharedList){
                        System.out.println("Reading item : "+item);
                        Thread.sleep(100);//small delay to stimulate work
                    }
                }
            } catch (Exception e) {
                System.out.println("exception in reader thread");
            }
        });
        Thread writerThread = new Thread(()-> {
            try{
                Thread.sleep(500);// delay to allow reading to start first
                sharedList.add("item4");
                System.out.println("Added item4 to the list ");

                Thread.sleep(500);
                sharedList.remove("item1");
                System.out.println("Removed item1 from the list");
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        });
        readerThread.start();
        writerThread.start();
        }
    }

