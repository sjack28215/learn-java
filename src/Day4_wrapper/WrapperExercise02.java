package Day4_wrapper;

public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(2);
        //new Integer 每次都会创建一个对象
        System.out.println(i == j); //这里的==比较的是两个对象
        //因为这里创建了两个对象 其地址是不同的 所以返回的是false

        Integer n = Integer.valueOf(1);
        Integer m = Integer.valueOf(1);
        //Integer n = 1;
        //Integer m = 1;
        System.out.println(m == n); // true
        //这里的结果是true 缓存机制
        //jvm在创建的时候就会创建
    }


}
