package com.teachmeskills.lesson10.part3;

public class Main {
    public static void main(String[] args) {
        String string= "Hello";

        char[] array = string.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char i : array) {
            sb.append(i);
            sb.append(i);
        }
        System.out.println(sb);
    }
}
