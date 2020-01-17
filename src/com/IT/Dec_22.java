package com.IT;

public class Dec_22 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Girl ira = new Girl("Ira", 25);
        Girl mira = new Girl("Mira", 22);
        System.out.println(ira.goToRest("MAC"));
        ira.countInts(1, 2, 3, 4);
        System.out.println(mira.getName());
        System.out.println(mira.getAge());
        mira.setAge(10000);

        System.out.println(mira);
        SuperGirl ket = new SuperGirl("Ket", 25, "fly");
        System.out.println(ket.goToRest("Aresdf"));
        System.out.println(ket);


        Point point = new Point(10, 10);
        Point point1 = new Point(10, 10);
        System.out.println(point.toString());
        System.out.println(point.equals(point1));
        System.out.println(point.hashCode());
        System.out.println(point1.hashCode());
        System.out.println(point.getClass() == Point.class);
        System.out.println(point.getClass());

        System.out.println(point.clone());

    }

}
