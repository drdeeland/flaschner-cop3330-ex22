/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        Number num1 = new Number("first");
        Number num2 = new Number("second");
        Number num3 = new Number("third");

        myApp.inputNumber(num1);
        myApp.inputNumber(num2);
        myApp.inputNumber(num3);

        myApp.checkSameNumber(num1, num2, num3);

        int biggestNumber = myApp.biggestNumber(num1.getNumber(), num2.getNumber());
        biggestNumber = myApp.biggestNumber(biggestNumber, num3.getNumber());

        String output = myApp.buildOutput(biggestNumber);
        myApp.printOutput(output);
    }

    public void inputNumber(Number num) {
        System.out.print("Enter the " + num.getOrdinal() + " number: ");
        num.setNumber(Integer.parseInt(input.nextLine()));
    }

    public void checkSameNumber(Number num1, Number num2, Number num3) {
        if (num1.getNumber() == num2.getNumber()) {
            System.exit(0);
        }
        if (num1.getNumber() == num3.getNumber()) {
            System.exit(0);
        }
        if (num2.getNumber() == num3.getNumber()) {
            System.exit(0);
        }
    }

    public int biggestNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public String buildOutput(int biggestNumber) {
        return "The largest number is " + biggestNumber;
    }

    public void printOutput(String output) {
        System.out.println(output);
    }
}
