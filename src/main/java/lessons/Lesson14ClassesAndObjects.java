package lessons;

public class Lesson14ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Andrew";
        person1.age = 20;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Dante";
        person2.age = 21;
        person2.speak();
    }
}

class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My name is, "+ name + "and my age is " + age);
    }
    void

}
