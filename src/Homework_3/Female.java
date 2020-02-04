package Homework_3;

import java.util.Random;
import java.util.Scanner;

public class Female extends Human{
    boolean sex = false;

    public Female(boolean sex, String name, String secondName, float height, float mass) {
        super(sex, name, secondName, height, mass);
    }

    public Female() {

    }


    public void giveBirth(Male h) {
        Random s = new Random();
        sex = s.nextBoolean();

        if (sex == true){

            System.out.println("New baby");
            Male child = new Male();
            child.sex = true;
            Scanner scanner = new Scanner(System.in);
            String scan1 = scanner.nextLine();
            child.name = scan1;
            child.secondName = h.secondName;
            child.height = h.height + ((this.height - h.height) / h.height);
            child.mass = h.mass + ((this.mass - h.mass) / h.mass);
            System.out.println(child);
        }
        else {
            System.out.println("New baby");
            Female fChild = new Female();
            fChild.sex = false;
            Scanner scanner = new Scanner(System.in);
            String scan2 = scanner.nextLine();
            fChild.name = scan2;
            fChild.secondName = h.secondName;
            fChild.height = this.height + ((h.height - this.height) / this.height);
            fChild.mass = this.mass + ((h.mass - this.mass) / this.mass);
        }
    }

    public void createProblem () {
        System.out.println("New problem!");

    }

    @Override
    public String toString() {
        return "Female{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", height=" + height +
                ", mass=" + mass +
                '}';
    }
}
