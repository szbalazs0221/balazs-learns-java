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

    public static String reverseWord(String word) {

        StringBuilder reversedWord = new StringBuilder();
        char[] letters = word.toCharArray();

        for (int i = letters.length - 1; i >= 0; i--) {
            reversedWord.append(letters[i]);
        }
        return reversedWord.toString();
    }

    public static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number-1);
    }

}
