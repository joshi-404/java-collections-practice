import java.util.LinkedList;
import java.util.Vector;

public class VectorsCollection {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();//initial capacity -> 10
        Vector<Integer> vector1=new Vector<>(3);//initial capacity -> 3 and capacity doubles
        Vector<Integer> vector2=new Vector<>(12,4);//initial capacity -> 12 and it increases by 4
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        vector1.add(4);
        System.out.println(vector1);
        System.out.println(vector1.capacity());

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        Vector<Integer> vector3=new Vector<>(linkedList);
        System.out.println(vector3);

        linkedList.clear();
        System.out.println(linkedList);

        vector1.clear();
        System.out.println(vector1);
    }
}

