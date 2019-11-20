package lessons;

public class Lesson19THISWord {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setNameHuman("Max");
        human1.setAgeHuman(21);
        human1.getInfoHuman();
    }

}

class Human{
    String nameHuman;
    int ageHuman;

    public String getNameHuman() {
        return nameHuman;
    }

    public void setNameHuman(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    public int getAgeHuman() {
        return ageHuman;
    }

    public void setAgeHuman(int ageHuman) {
        this.ageHuman = ageHuman;
    }

    public void getInfoHuman(){
        System.out.println(nameHuman+", "+ageHuman);
    }
}
