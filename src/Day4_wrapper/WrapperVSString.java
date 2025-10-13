package Day4_wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        Integer i = 100;
        //方式一
        String str1 = i + "";
        //方式二
        String str2 = i.toString();
        //方式三
        String str3 = String.valueOf(i);


        //String向包装类转化
        String str4 = "12345";
        Integer i2= Integer.parseInt(str4);
        Integer i3 = new Integer(str4);
        System.out.println("ok ~");
    }
}
