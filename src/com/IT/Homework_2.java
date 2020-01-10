package com.IT;

import com.sun.source.tree.IfTree;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner((System.in));
        String next = scan.nextLine();
        String[] s = next.split(" ");
        System.out.println(next);
        System.out.println(Arrays.toString(s));
        int min = 100000000;
        int max = 0;
        String minNum = null;
        String maxNum = null;
        for (String array : s) {
            if (array.length() <= min) {
                min = array.length();
                minNum = array;
            }
            if (array.length() >= max){
                max = array.length();
                maxNum = array;
            }
        }
        System.out.println("Min number is "+ minNum + ". the length is "+ min);
        System.out.println("Max number is " + maxNum + ". the length is " + max);*/

// ------------------------------------2---------------------------------------------

        /*Scanner scan = new Scanner((System.in));
        String next = scan.nextLine();
        String[] s = next.split(" ");
        System.out.println(next);
        System.out.println(Arrays.toString(s));

        for (int i = s.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (s[j].length() > s[j + 1].length()) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(s));*/
        //-------------------------------------3----------------------------------------

        /*Scanner scan = new Scanner((System.in));
        String next = scan.nextLine();
        String[] s = next.split(" ");
        System.out.println(next);
        System.out.println(Arrays.toString(s));
        int x = 0;
        for (String array : s) x += array.length();

        int avg = x / s.length;
        System.out.println(avg);

        for (String array : s) {
            if (array.length() <= avg) {
                System.out.println("Number " + array + " has length that is less than average. It's length is " + array.length());
            }
            if (array.length() > avg) {
                System.out.println("Number " + array + " has length that is more than average. It's length is " + array.length());
            }
        }*/
//-------------------------------------------------6-----------------------------------------------------------
        /*Scanner scan = new Scanner((System.in));
        String next = scan.nextLine();
        String[] s = next.split(" ");
        System.out.println(next);
        System.out.println(Arrays.toString(s));

        for (int i = 0; i < s.length; i++) {
            String[] strings = s[i].split("");
            String a = Arrays.toString(strings);
            System.out.println(Arrays.toString(strings));
            Arrays.sort(strings);
            String b = Arrays.toString(strings);
            System.out.println(Arrays.toString(strings));
            if (a.equals(b)){
                System.out.println("We've found it");
                System.out.println("this is " + a);
                break;
            }
        }*/
        //------------------------------------------7--------------------------------------------------

        Scanner scan = new Scanner((System.in));
        String next = scan.nextLine();
        String[] s = next.split(" ");
        System.out.println(next);
        System.out.println(Arrays.toString(s));
        for (String value : s) {
            String[] strings = value.split("");
            //System.out.println(Arrays.toString(strings));
            Arrays.sort(strings);
            //System.out.println(Arrays.toString(strings));
            int check = 0;
            for (int h = strings.length - 1; h >= 0; h--) {

                for (int j = 0; j < h; j++) {
                    if (strings[j].equals(strings[j + 1])) {
                        check++;
                    }
                }
            }
            if (check > 0) {
                System.out.println("Not this");
            } else {
                System.out.println("this one");
                System.out.println(Arrays.toString(strings));
            }
        }
    }
}








