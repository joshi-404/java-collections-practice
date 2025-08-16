import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();//HashMap<key,value>
        map.put(1,"Jake");
        map.put(2,"Amy");
        map.put(3,"Terry");
        System.out.println(map);

        System.out.println(map.get(2));//get() takes object key
        System.out.println(map.get(22));//returns null
        System.out.println(map.containsKey(2));//returns whether map contains the key or not
        System.out.println(map.containsValue("Maya"));//returns whether map contains the value  or not

        Set<Integer> keys = map.keySet();
        for(int i : keys)
        {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        Set<Map.Entry<Integer, String>> x = map.entrySet();
        for (Map.Entry<Integer, String> entry : x){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);
    }
}
