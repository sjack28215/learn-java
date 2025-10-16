package Day6;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("jack");
        set.add("lucy");
        set.add("jack");
        set.add("hello");
        set.add(null);
        set.add(null);
        for(Object obj :set){
            System.out.println("set="+set);
        }


        //set的遍历方法
        //一 通过iterator  二 for
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // for遍历
        set.remove(null);
        for(Object obj:set){
            System.out.println(obj);
        }
    }
}
