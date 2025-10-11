package Day3_Exception;

public class TryCatchDetail02 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            System.out.println(person.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1/n2;
        } catch (NullPointerException e) {
            System.out.println("空指针");

        }catch (ArithmeticException e) {
            System.out.println("算数异常"+e.getMessage());
        }catch(Exception e) {
            System.out.println("异常" + e.getMessage());
        }finally {
        }
    }
}

class Person{
    private String name = "jack";
    public String getName(){
        return name;
    }
}