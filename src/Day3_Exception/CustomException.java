package Day3_Exception;

public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if(!(age>=18 && age<=120)){
            throw new AgeException("年龄需要在18到120");
        }
        System.out.println("输入年龄的正确范围");
    }

}
class AgeException extends RuntimeException{
    public AgeException(String message){
        super(message);
    }
}
