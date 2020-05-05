package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();

        if(a<=14) {
            switch (a) {
                case 1:
                    System.out.println(a + " программист");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(a + " программиста");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    System.out.println(a + " программистов");
                    break;
            }
        }
            else {
                if (a%10==1){
                    System.out.println(a+" программист");
                }
                if (a%10==2 || a%10==3 || a%10==4){
                    System.out.println(a+" программиста");
                }
                if (a%10==5 || a%10==6 || a%10==7 || a%10==8 || a%10==9 || a%10==0){
                    System.out.println(a+ " программистов");
                }


        }
    }
}
