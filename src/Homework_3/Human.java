package Homework_3;

import java.util.Random;

abstract class Human {

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

    public Human (){

    }

    public boolean Speak(Human h) {
        if (h.sex == false && this.sex == true)
            return false;

        if (h.sex == true && this.sex == false)
            return true;

        if (h.sex == false && this.sex == true)
            return true;
        else {
            Random x = new Random();
            if (x.nextBoolean() == false) {
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean Endure(Human h) {
        if (h.sex == true && this.sex == false) {
            Random x = new Random();
            if (x.nextDouble() <= 0.7) {
                return true;
            } else
                return false;
        } else if (h.sex == false && this.sex == false) {
            Random n = new Random();
            if (n.nextDouble() <= 0.05) {
                System.out.println("G = G");
                return true;
            } else
                return false;
        } else if (h.sex == true && this.sex == true) {
            Random x = new Random();
            if (x.nextDouble() <= 0.056) {
                return true;
            } else {
                return false;
            }
        } else {
            Random x = new Random();
            if (x.nextDouble() <= 0.7) {
                return true;
            } else
                return false;
        }
    }

    public boolean spendTimeTogether(Human h) {
        float heightDifference = Math.abs((h.height - this.height) / this.height);
        System.out.println(heightDifference);
        if ((heightDifference < 0.1) == true) {
            Random x = new Random();
            double x1 = x.nextDouble();
            if (x1 <= 0.95) {
               // System.out.println("шанс= " + x1);
                return true;
            } else return false;
        }
        if ((heightDifference < 0.1) == false) {
            Random y = new Random();
            double y1 = y.nextDouble();
            if (y1 <= 0.85) {
                //System.out.println("шанс y1= " + y1);
                return true;
            } else return false;
        }
        System.out.println("Что-то пошло не так");
        return false;
    }

    public void haveRelationship(boolean sex, boolean sex2) {
        if (sex == sex2) {
            System.out.println("Null");
        } else {
            System.out.println("OK");
        }
    }

    public void compatibilityTest(Human h1, Human h2) {
        //if ()
    }

    public void haveRelationship(boolean sex) {
    }
}
