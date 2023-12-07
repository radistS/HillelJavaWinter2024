package com.hillel.lesson_03.ex;

// count sum of odd numbers 12235 - 1 + 3 + 5 = 9
public class ChetNumber {

    public static void main(String[] args) {
        int number = 1_111_111_111;
//        System.out.println(calculate(number));
        System.out.println(calc(number));
    }

    private static int calculate(int value) {
        int rez = 0;
        char[] charArray = String.valueOf(value).toCharArray();
        for (char c : charArray) {
            int tmp = Integer.parseInt(String.valueOf(c));
            if (tmp % 2 != 0) {
                rez += tmp;
            }
        }
        return rez;
    }

    private static int calc(int value) {
        int rez = 0;
        while (value > 0) {
            int tmp = value % 10;
            if (tmp % 2 != 0)
                rez += tmp;
            value = value / 10;
        }
        return rez;
    }
}
