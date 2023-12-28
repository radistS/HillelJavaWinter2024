package com.hillel.lesson_08.set;

import java.util.HashSet;
import java.util.Set;

public class HSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(5);

        System.out.println(set.add("1qweq"));
        System.out.println(set.add("1sdfsd")); // false
        System.out.println(set.add("2zxczxc"));
        System.out.println(set.add("3erter"));
        System.out.println(set.add("4jk;kl;"));
        System.out.println(set.add("fhfj"));
        System.out.println(set.add("6"));
        System.out.println(set.add("7dfghgfh"));
        System.out.println(set.add("8vbnvbn"));

        System.out.println("-----------");

        System.out.println(set);


        int i = 1;
        int count = 0;
        String value = null;
        for (String s : set){
            if (count++ == i) value = s;
         }

        System.out.println(value);
    }
}
