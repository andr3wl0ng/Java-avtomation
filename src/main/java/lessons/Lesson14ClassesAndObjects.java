package lessons;

public class Lesson14ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName(null);
        person1.setAge(22);
      //  person1.speak();

        System.out.println("выводим значение в main ");
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            System.out.println("empty string");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void speak() {
        System.out.println("My name is, " + name + " and my age is " + age);
    }

//    void sayHello(){
//        System.out.println("Hello!");
//    }
//
//    int calcYearsToRet(){
//       int years = 65 - age;
//        return years;
//    }
//
//    void setPersonParams(String  userName, int userAge){
//        name = userName;
//        age = userAge;
//
//    }


}
