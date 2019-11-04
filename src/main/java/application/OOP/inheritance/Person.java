package application.OOP.inheritance;

public class Person {
    protected String name;
    protected String faculty;

    public Person(String name, String faculty){
        this.name = name;
        this.faculty = faculty;
    }

    public Person(String faculty){
        this.faculty =  faculty;
    }

    public Person(){
    }
}
