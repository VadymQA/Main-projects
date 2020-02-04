package Homework_3;

public class Male extends Human{

    boolean sex = true;

    public Male(boolean sex, String name, String secondName, float height, float mass) {
        super(sex, name, secondName, height, mass);
    }

    public Male() {

    }


    @Override
    public String
    toString() {
        return "Male{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", height=" + height +
                ", mass=" + mass +
                '}';
    }

    public void solveProblem () {

        System.out.println("Problem is solved");

    }
}
