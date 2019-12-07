package com.IT;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Dec7_8 {
    public static void main(String[] args) {
        //bubble sort
        /*int[] ar = {2, 1, 3, 4, 7, 6};
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar));
        for (int i = ar.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(ar));
        }*/

        /*System.out.println(new StringBuffer("Мама мыла раму!").reverse());
        String s = "Мама мыла раму!";
        String[] ars = "Мама мыла раму!".split("");
        System.out.println(Arrays.toString(ars));

        for (int j = 0; j < ars.length / 2; j++) {
            String tmp = ars[j];
            ars[j] = ars[ars.length - 1 - j];
            ars[ars.length - 1 - j] = tmp;
        }
        System.out.println(Arrays.toString(ars));*/


        Scanner scan = new Scanner((System.in));
        String next = scan.nextLine();
        String[] s = next.split(" ");
        System.out.println(next);
        System.out.println(Arrays.toString(s));
        String[] strings = s[0].split("");
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));





    }
}
