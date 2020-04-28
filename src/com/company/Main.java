package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 10");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        switch (a) {
            case 1:
                System.out.println(a+" программист");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(a+" программиста");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println(a+" программистов");

        }
    }
}
