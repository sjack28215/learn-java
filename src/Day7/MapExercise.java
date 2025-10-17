package Day7;
import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1,new Employee(1,"jack",19000));
        map.put(2,new Employee(2,"jane",17000));
        map.put(3,new Employee(3,"sss",20000));

        Set keySet = map.keySet();
        System.out.println("第一种遍历方式");
        for(Object key:keySet){
            Employee em =(Employee) map.get(key);
            if(em.getSal() >= 18000) {
                System.out.println(em);
            }
        }

        Set entrySet = map.entrySet();
        System.out.println("迭代器");
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            Employee emp = (Employee) entry.getValue();
            if(emp.getSal()>=18000){
                System.out.println(emp);
            }
        }
    }
}
class Employee{
    private int id;
    private  String name;
    private double sal;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    @Override
    public String toString(){
        return "name "+name +" id "+id +" sal "+sal;
    }
}
