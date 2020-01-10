package com.IT;

public class Girl {
    private final String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 30)
        this.age = age;
    }

    public String goToRest(String rest) {
        if ("Mac".equalsIgnoreCase(rest)) {
            return "no";
        } else {
            return "yes";
        }
    }

    public int countInts(int... i) {
        int sum = 0;
        for (int age : i) {
            sum += age;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
