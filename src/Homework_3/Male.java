package Homework_3;

public class Male extends Human{

    boolean sex = true;

    public Male(boolean sex, String name, String secondName, float height, float mass) {
        super(sex, name, secondName, height, mass);
    }

    public void solveProblem () {

        System.out.println("Problem is solved");

    }
}
