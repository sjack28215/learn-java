package Day3_Exception;

public class TryCatchDetail03 {
    public static void main(String[] args) {
        try {
            int n1 = 10;
            int n2 = 0;
            int res = n1/n2;
        } finally {
            System.out.println("执行finally");
        }
        System.out.println("继续执行");
    }
}
