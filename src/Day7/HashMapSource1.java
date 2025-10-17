package Day7;
import java.util.HashMap;

public class HashMapSource1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java", 10);//ok
        map.put("php", 10);//ok
        map.put("java", 20);//替换 value
        System.out.println("map=" + map);
    }
}
