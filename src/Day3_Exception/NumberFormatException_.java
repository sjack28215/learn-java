package Day3_Exception;
//数字格式不正确异常
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "hello jack";
        int num = Integer.parseInt(name);//parseInt 将“1234”转化为int 数字 而这里给的是hello
        //属于是字符串
        System.out.println(num);

    }
}
