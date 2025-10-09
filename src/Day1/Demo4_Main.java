package Day1;

public class Demo4_Main {
    public static void main(String[] args)
    {

        Demo3_Person p = new Demo3_Person();
        p.setName("Alice");

        // System.out.println(p.name); // Error: 'name'
        // has private access
        System.out.println(p.getName());
    }
}

