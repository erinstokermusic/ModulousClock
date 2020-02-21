package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        modulusClock();
    }

    public static void modulusClock() {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int minute;
        int hour;

        System.out.println("Give me the hour.");
        hour = keyboard.nextInt();
        System.out.println("Give me the minutes.");
        minute = keyboard.nextInt();

        hour = minute >= 60 ? (hour%12)+1 : hour%12 ;
        System.out.println(hour + " " + minute);
    }
}
