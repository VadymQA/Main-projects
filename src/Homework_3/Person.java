package Homework_3;

class Person {

    boolean sex;
    String name;
    String secondName;
    float height;
    float mass;


    public Person(boolean sex, String name, String secondName, float height, float mass) {
        this.sex = sex;
        this.name = name;
        this.secondName = secondName;
        this.height = height;
        this.mass = mass;
    }

    public void Speak() {
    }

    public void Endure() {

    }

    public void spendTimeTogether() {

    }

    public void haveRelationship() {

    }

    public String pregnant() {
        if (this.sex = false) {
            return "yes";
        }

        return null;
    }


}
