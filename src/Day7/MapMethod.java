package Day7;
import java.util.HashMap;
import java.util.Map;
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack",new Book("java",100));
        map.put("jack","huaidan");
        map.put("A同学","C同学");
        map.put("B同学","C同学");
        map.put("D同学",null);
        map.put(null,"D同学");
        System.out.println(map);

        //remove 根据key来删除
        map.remove(null);
        System.out.println(map);

        //get 根据key来获取值
        System.out.println(map.get("jack"));

        //size元素个数
        //isEmpty
        //clear
        //containKey
        //keySet获取所有key的值
        //entrySet 获取所有key value
        //values 获取所有的值

    }
}
class Book{
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}