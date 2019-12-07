package com.IT;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) throws IOException {
        // -----------------------------1---------------------------------
       /* System.out.println("Please, enter your name");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Hello, " + s);*/

        //-------------------------------2--------------------------------
        /*int nums[] = {1, 5, 3, 7, 9};
        for (int x : nums) {
            System.out.println("args = " + x);
        }*//*
        for (int i = args.length-1; i >= 0 ; i--) {
            System.out.println("args = " + args[i]);
        } // this is correct HW task

        for (int i = 0; i <= args.length-1 ; i++) {
            System.out.println("args = " + args[i]);
        } // this is for practice*/
        //--------------------------------3--------------------------------
        /*System.out.println("Enter a quantity of random numbers");
        Scanner scan3 = new Scanner(System.in);
        int n = Integer.parseInt(scan3.next());
        for (int j = 0; j < n; j++) {
            Random random = new Random();
            int i = random.nextInt(100);
            System.out.print(i+ " ");
            System.out.println(i);
        }*/
        //---------------------------------4--------------------------------
        /*System.out.println("Enter password here");
        Scanner scan4 = new Scanner(System.in);
        String userPass = scan4.nextLine();
        String Password = "Admin";*/
//        switch (userPass) {
//            case "Admin":
//                System.out.println("Correct! Welcome, Admin");
//                break;
//            default:
//                System.out.println("Incorrect password");
//        }

        /*if (userPass.equals("Admin")) {
            System.out.println("Correct! Welcome, Admin");
        } else {
            System.out.println("Incorrect password");
        }*/
        //----------------------------------5----------------------------
        /*int sum = 0;
        int multiple = 1;
        int nums[] = {3,4,1,3,-11};

        for (int x = 0; x < nums.length; x++) {
            sum = sum + nums[x];
            multiple = multiple * nums[x];
        }
        System.out.println(sum);
        System.out.println(multiple);*/

        // -----------------------------------6-----------------------------
        Scanner scan6 = new Scanner(System.in);
        int n = Integer.parseInt(scan6.next());
        int[] myArray = new int[n];

        for (int j = 0; j < n; j++) {
            Random random = new Random();
            int i = random.nextInt(1000);
            myArray[j] = i;
        }
        System.out.println(Arrays.toString(myArray));
        int max = 0;
        int min = myArray[0];
        for (int l = 0; l < myArray.length; l++) {
            /*if (myArray[l] % 2 == 0) {
                System.out.println(myArray[l] + " - чётное");
            } else {
                System.out.println(myArray[l] + " - нёчетное");
            }
            if (myArray[l] % 3 == 0 && myArray[l] % 9 == 0) {
                System.out.println(myArray[l] + " - делится на 3 и на 9");
            }
            if (myArray[l] % 5 == 0 || myArray[l] % 7 == 0) {
                System.out.println(myArray[l] + " - делится на 5 или на 7");
            }
*/
            if (myArray[l] > max) {
                max = myArray[l];
            }
            if (myArray[l] < min) {
                min = myArray[l];
            }
            if (myArray[l] > 999 && myArray[l] < 10000) {

                String sp = Integer.toString(myArray[l]);

                for (String qwe : sp.split("")) {
                    System.out.println(qwe);

                }
            }

        }
        System.out.println("MAX num is = " + max);
        System.out.println("MIN num is = " + min);

        for (String arg : args) {
            String[] split = arg.split("");
            int one = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
            int two = Integer.parseInt(split[2]) + Integer.parseInt(split[3]);
            if (one == two) {
                System.out.println(arg);
            }
        }
    }
}





