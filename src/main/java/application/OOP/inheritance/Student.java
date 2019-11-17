package application.OOP.inheritance;

public class Student extends Person {
    private String uni;
    private String response = "ehh, WTF ?";

    public Student() {
        super();
        super.name = name;
        super.faculty = faculty;
        this.uni = uni;
    }

    public String getResponse(String question){
        return response;
    }


}

