package Day6;

import java.util.HashSet;
import java.util.Set;


public class HashSet_ {
    public static void main(String[] args) {

        /*
            public HashSet(){
                map = bew HashMap<>();
            }
         */

        //hashset可以存放null 但是只能存放一个
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet="+hashSet);
    }
}
