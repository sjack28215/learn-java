package Day5;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        String str = "hello tom";
        //1.使用构造器
        StringBuffer stringbuffer = new StringBuffer(str);
        //使用append方法
        StringBuffer stringbuffer1 =new StringBuffer();
        stringbuffer1.append(str);

        //StringBuffer 转化为String
        //toString 方法
        String str1 = stringbuffer1.toString();
        //构造器
        String str2 = new String(stringbuffer);


    }
}
