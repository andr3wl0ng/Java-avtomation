package main.java.lessons;

public class Lesson14ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Andrew";
        person1.age = 20;
        System.out.println("My name is "+ person1.name +"and my age is" + person1.age);

        Person person2 = new Person();
        person2.name = "Dante";
        person2.age = 21;
        System.out.println("My name is "+ person2.name +"and my age is" + person2.age);
    }
}

class Person{
    // classes has two things
    // data(fields)
    // moves that he can do(methods)

    String name;
    int age;
}
