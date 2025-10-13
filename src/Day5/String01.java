package Day5;

public class String01 {
    public static void main(String[] args) {
        //String对象保存字符串 一组字符序列
        //“jack”字符序列 双引号括起来的字符序列
        //String类有很多构造器 构造器的重载
        //STring类是finall类 不能被其他类继承
        // String有属性 private final char value[]
        // value是一个final类型
        // value的指向不能指向新的地址 但是单个字符内容是可以变化的


        String name = "jack";
        name = "tom";
        final char[] value = {'a','b','c'};
        char[] v2 = {'t','o','m'};
        value[0] = 'H';
        //value = v2;  不可以修改value的值
    }
}
