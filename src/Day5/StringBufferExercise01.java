package Day5;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        //当append的参数是null的时候 append会自动将null 转化为字符串null 所以这里不会报错
        System.out.println(sb.length());
        System.out.println(sb);

        //StringBuffer sb1 = new StringBuffer(str);
        //在这里str不能为null  否则就会抛出异常
        //System.out.println(sb1);
    }
}
