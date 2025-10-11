package Day3_Exception;

public class Try_catch01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1/num2;
        } catch (Exception e) {

            System.out.println("原因"+e.getMessage());
        }
    }
}
