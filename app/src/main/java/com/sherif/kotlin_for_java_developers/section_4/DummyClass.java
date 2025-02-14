package com.sherif.kotlin_for_java_developers.section_4;

public class DummyClass {

    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on vacation" : "I'm working";
    }

    public void printNumbers(int[] numbers) {
        for(int number : numbers) {
            System.out.println(number);
        }
    }

    public void method1(char[] charArray) {
        for(char c : charArray) {
            System.out.println(c);
        }
    }
}
