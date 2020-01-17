package Homework_3;

public class Female extends  Human{
    boolean sex = false;

    public Female(boolean sex, String name, String secondName, float height, float mass) {
        super(sex, name, secondName, height, mass);
    }

    public void giveBirth() {
    System.out.println("New baby");
    }

    public void createProblem () {
        System.out.println("New problem!");

    }


}
