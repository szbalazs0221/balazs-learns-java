package main.java.algorithms;

public class Algorithms {

    public static String getLongestWord(String sentence) {

        String longestWord = "";
        String[] splitSentence = sentence.trim().split("\\s|\\p{Punct}");

        for (String word : splitSentence) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;

    }

}
