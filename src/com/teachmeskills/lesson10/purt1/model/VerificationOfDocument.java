package com.teachmeskills.lesson10.purt1.model;

public class VerificationOfDocument {
    public static void outputOfTwoFirstBlocks(String string) {
        String[] array = string.split("-");
        System.out.println(array[0] + array[2]);
    }

    public static void replacingLettersWithStars(String string) {
        String str = string.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(str);
    }

    public static void displayLettersInLowerCase(String string) {
        String[] array = string.toLowerCase().split("-");
        System.out.println(array[1] + "/" + array[3] + "/" + array[4].charAt(1) + "/" + array[4].charAt(3));
    }

    public static void whetherTheNumberContainsASequence(String string) {
        final String SUBSEQUENCE = "abc";
        if (string.toLowerCase().contains(SUBSEQUENCE.toLowerCase())) {
            System.out.println("The document contains this sequence");
        } else {
            System.out.println("The document does not contains this sequence");
        }
    }

    public static void whetherTheNumberStartsWithASequence(String string) {
        if (string.startsWith("555")) {
            System.out.println("Document number starts with 555");
        } else {
            System.out.println("Document number does not start with 555");
        }
    }

    public static void doesTheNumberEndWithASequence(String string) {
        if (string.endsWith("1a2b")) {
            System.out.println("Document number ends with 1a2b");
        } else {
            System.out.println("Document number does not end with 1a2b");
        }
    }

    public static void displayLettersInUpperCase(String string) {
        String[] array = string.toUpperCase().split("-");

        StringBuilder sb = new StringBuilder();

        sb.append(array[1]);
        sb.append("/");
        sb.append(array[3]);
        sb.append("/");
        sb.append(array[4].charAt(1));
        sb.append("/");
        sb.append(array[4].charAt(3));

        System.out.println(sb);
    }
}
