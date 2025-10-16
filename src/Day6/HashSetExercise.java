package Day6;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;

public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee(18,"milan"));
        hashSet.add(new Employee(28,"smith"));
        hashSet.add(new Employee(18,"milan"));
        System.out.println("hashSet="+hashSet);
    }


}
class Employee {
    private String name;
    private int age;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return "Employee{" +
                "name='"+name+'\''+
                ",age="+age+
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null | getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}