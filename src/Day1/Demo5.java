package Day1;

public class Demo5 {
    public static void Names(String... n){
        for(String i :n){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Names("1","2");
        Names("1","2","3");
    }
}
