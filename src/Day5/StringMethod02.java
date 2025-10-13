package Day5;

public class StringMethod02 {
    public static void main(String[] args) {
        //concat 拼接字符串
        String s1 = "jack";
        s1 = s1.concat("haha").concat("jakc");
        System.out.println(s1);
        // replace  替换字符串中的字符
        s1 = "暴雨 and day day day";
        String s2 = s1.replace("day","jack");
        System.out.println(s1);
        System.out.println(s2);

        //split 分隔符
        //1. 以分隔符为标准对字符串分割 返回一个数组
        String poem = "jack,ka,l,a,vv";
        String[] split = poem.split(",");

        //toCharArray 转化为字符数组
        //compareTo 比较两个字符数组的大小

    }
}
