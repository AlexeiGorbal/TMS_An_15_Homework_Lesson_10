package com.teachmeskills.lesson10.part2.model;

public class WordProcessing {
    public static void outputOfTheShortestAndLongestWord(String string) {
        String str = string.replaceAll(",", "").replaceAll("\\.", "");

        String[] array = str.split(" ");

        String longWord = array[0];
        String shortWord = array[0];
        for (String i : array) {
            if (longWord.length() <= i.length()) {
                longWord = i;
            }
            if (shortWord.length() >= i.length()) {
                shortWord = i;
            }
        }

        System.out.println("Long word: " + longWord);
        System.out.println("Short word: " + shortWord);
    }
}
