package com.teachmeskills.lesson10.part2;

import com.teachmeskills.lesson10.part2.model.WordProcessing;

public class Main {
    public static void main(String[] args) {
        String text = "Ronald Dean Coleman is an American retired professional bodybuilder." +
                " The winner of the Mr. Olympia title for eight consecutive years," +
                " he is widely regarded as either the greatest bodybuilder of all time" +
                " or one of the two greatest along with Arnold Schwarzenegger";

        WordProcessing.outputOfTheShortestAndLongestWord(text);
    }
}