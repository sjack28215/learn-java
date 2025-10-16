package Day6;
import java.util.HashSet;
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        //执行add方法后 会返回一个boolean值
        //如果添加成功 会返回true 失败返回false
        System.out.println(set.add("jack"));
        System.out.println(set.add("hello"));
        System.out.println(set.add("jack"));

        set.remove("hello");
        System.out.println("set = "+set);

        set.add(new String("jack"));
        set.add(new String("jack"));
        System.out.println("set=" + set);
    }
}
