package Day1;

public class Demo1 {
    public static void greet(){
        System.out.println("hello ");
    }

    public static void main(String[] args){
        Demo1 d = new Demo1();
        //直接调用
        greet();
        //类方法调用
        Demo1.greet();
        //利用实例来调用 但1不常用
        d.greet();


    }
}
