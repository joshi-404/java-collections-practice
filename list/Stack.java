import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        System.out.println(stack);
        Integer removedElement=stack.pop();
        System.out.println(removedElement);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        stack.add(2,8);//stack is sub class of vectors so it can access its methods
        System.out.println(stack);
        //4->index:1
        //4 :2
        //3: 3
        //8: 4
        //2: 5
        //1: 6
        System.out.println(stack.search(3));//searching is 1 based indexing 3 is 3rd from top

        //LinkedList as Stack
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        System.out.println(linkedList);
        System.out.println(linkedList.getLast());//peek
        linkedList.removeLast();//pop
        System.out.println(linkedList);


        //ArrayList as Stack
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.get(arrayList.size()-1);//peek
        arrayList.remove(arrayList.size()-1);//pop
    }
}
