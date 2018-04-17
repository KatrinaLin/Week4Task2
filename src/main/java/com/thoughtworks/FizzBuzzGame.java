package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public void start(int count) {
        for (int i = 1; i <= count ; i++) {
            results.add(sayWord(i));
        }
    }

    public List<String> getResults() {
        return results;
    }

    public String sayWord(int num) {

        String numInWord = String.valueOf(num);

        if (numInWord.contains("3")) {
            return FIZZ;
        }

        StringBuilder sb = new StringBuilder();

        // if the number is multiplier of 3, say "Fizz"
        if (num % 3 == 0) {
            sb.append(FIZZ);
        }

        if (num % 5 == 0) {
            sb.append(BUZZ);
        }

        if (num % 7 == 0) {
            sb.append(WHIZZ);
        }

        if (sb.length() != 0) {
            return sb.toString();
        } else {
            return numInWord;
        }
    }


}


