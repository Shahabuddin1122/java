package Inheritance;

public class Person {
    private String name;
    private int  age;
    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getValue() {
        System.out.printf("My name is %s at %d ",this.getName(),this.getAge());
    }
}
