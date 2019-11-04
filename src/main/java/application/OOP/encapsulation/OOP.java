package application.OOP.encapsulation;

public class OOP {
    public String public_string;
    private String private_string;
    protected String protected_string;
    String default_string;

    OOP(){
        public_string = "temp";
    }

    OOP(String newNameOnStart){
        this.public_string = newNameOnStart;
    }

    OOP(String s, String ss){
        public_string = s;
        System.out.println(ss);
    }
}
