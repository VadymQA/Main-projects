package com.IT;

public class Dec21_22 {
    public static void main(String[] args) {

        /*Girl girl = new Girl("Ira", 25);
        Girl girl1 = new Girl("Mira", 22);
        System.out.println(girl.goToRest("MAC"));
        girl.countInts(1, 2, 3, 4);*/

       /* test();
        test(10);
        test(10, 20);
        test(20.5);
        System.out.println(test("Hi"));*/

        Test ob = new Test(15, 20);

        int x = 10;
        int y = 10;
        ob.meth(x, y);
        System.out.println(x);
        System.out.println(y);
        System.out.println();
        System.out.println(ob.a);
        System.out.println(ob.b);
        ob.meth(ob);
        System.out.println(ob.a);
        System.out.println(ob.b);
    }

    static class Test {
        int a, b;

        public Test(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public static void meth(int x, int y) {
            x *= 2;
            y /= 2;
            System.out.println();
        }

        public void meth(Test ob) {
            ob.a *= 2;
            ob.b /= 2;

        }
    }

   /* private static void test() {
        System.out.println("test()");
    }

    *//*private static void test(int i) {
        System.out.println("test(int i)");
    }*//*

    private static void test(int ...i){
        System.out.println("test(int...i)");
    }

    private static void test(int i, int i1) {
        System.out.println("test(int i, int i1)");
    }

    private static void test(double v) {
        System.out.println("test(double v)");
    }

    private static String test(String s) {
        return "Hi";
    }*/
}
