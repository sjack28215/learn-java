package Day5;

public class StringBufferMethod {
    public static void main(String[] args) {
        //append
        StringBuffer s = new StringBuffer("hello");
        s.append("jack");
        System.out.println(s);
        //delete
        //删除索引大于 x~y
        s.delete(1,3);
        System.out.println(s);
        //replace 替换索引x~Y的
        s.replace(1,3,"aaa");

        //indexof
        //insert 在索引位置插入字符串

    }
}
