package Homework_3;

import java.util.Random;

class Human {

    boolean sex;
    String name;
    String secondName;
    float height;
    float mass;


    public Human(boolean sex, String name, String secondName, float height, float mass) {
        this.sex = sex;
        this.name = name;
        this.secondName = secondName;
        this.height = height;
        this.mass = mass;
    }

    public static boolean Speak(boolean a, boolean b) {
        if (a == false && b == false) {
            return true;
        }
        if (a = !b) {
            return true;
        } else {
            Random x = new Random();

            if (x.nextBoolean() == false) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static boolean Endure(boolean a, boolean b) {
        if (a != b) {
            Random x = new Random();
            if (x.nextDouble() <= 0.7) {
                return true;
            } else
                return false;
        }

        if (a == true && b == false) {
            Random x = new Random();
            if (x.nextDouble() <= 0.7) {
                return true;
            } else
                return false;
        }

        if (a == false && b == false) {
            Random n = new Random();
            if (n.nextDouble() <= 0.05) {
                System.out.println("G = G");
                return true;
            } else
                return false;
        }

        if (a == true && b == true) {
            Random x = new Random();
            if (x.nextDouble() <= 0.056) {
                return true;
            } else {
                return false;
            }
        }
        else
            return false; // почему???
    }

    public void spendTimeTogether() {

    }

    public void haveRelationship(boolean sex, boolean sex2) {
        if (sex == sex2) {
            System.out.println("Null");
        } else {
            System.out.println("OK");
        }
    }

    public void haveRelationship(boolean sex) {
    }
}
