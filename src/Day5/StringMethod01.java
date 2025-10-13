package Day5;

public class StringMethod01 {
    public static void main(String[] args) {
        //equals
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));

        //equalsIgnoreCase
        str1 = "Jack";
        str2 = "jack";
        System.out.println(str1.equalsIgnoreCase(str2));

        //length
        System.out.println("jack".length());

        //indexOf
        System.out.println("jack".indexOf('a'));

        //lastIndexOf
        System.out.println("jack".lastIndexOf('a'));

        //subString
        System.out.println("jack".substring(2));


    }
}
