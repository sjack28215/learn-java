package Day7;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"a");
        map.put(2,"b");
        map.put(1,"c");
        map.put(3,"c");
        map.put(null,null);
        map.put(null,"abc");
        map.put(5,null);
        map.put(6,null);
        System.out.println(map.get(1));
        System.out.println(map);
    }
}
