package com.sparta.bd;

import static java.lang.Character.isLetter;

public class StringKata {

    public static boolean isPalindrome(String word){
        boolean result = false;
        if(word.length() < 3){
            return false;
        }

        StringBuilder reverse = new StringBuilder(word.toLowerCase()).reverse();
        if(word.toLowerCase().contentEquals(reverse)){
            result = true;
        }

        return result;

    }

    public static String removeSpecialChar(String sentence){
        char[] sentenceArray = sentence.toCharArray();
        StringBuilder result = new StringBuilder();

        for(char letter: sentenceArray){
            if(isLetter(letter) || String.valueOf(letter).contentEquals(" ")){
                result.append(letter);
            }
        }
        return String.valueOf(result);
    }


    public static String longestPalindromeInSentence(String sentence){
        String[] sentenceArray = removeSpecialChar(sentence).split(" ");
        StringBuilder result =  new StringBuilder("there are no palindromes");

        int longestLength = 2;
        for(String word: sentenceArray){

            if(isPalindrome(word)){

                if(word.length() > longestLength){
                    result = new StringBuilder(word);
                    longestLength = word.length();
                } else if (word.length() == longestLength && !String.valueOf(result).contains(word)) {
                        result.append(" ");
                        result.append(word);

                }

            }
        }
        return String.valueOf(result);


    }

}
