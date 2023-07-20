package com.project.astha;

import java.util.Locale;

public class WordPalindrome {

    public static boolean isWordValid(String word) throws NullPointerException, IllegalArgumentException {
        boolean result=false;
        if (word == null) {
            throw new NullPointerException("Null values are not allowed");
        } else if (word.isEmpty()) {
            throw new IllegalArgumentException("Empty word not allowed");
        }else{
            word=word.trim();
           result=isPalindromeJustStringWay(word);
            isPalindromeStringBuilderWay(word);
            isPalindromeRecursiveWay(word);

        }
        return result;
    }




    public static boolean isPalindromeJustStringWay(String word) {
        word=word.toLowerCase();
            boolean result = true;
            if(word.length()>1) {
                char[] words = word.toCharArray();
                for (int i = 0; i < words.length / 2; i++) {
                    if (words[i] != words[words.length - i - 1]) {
                        result = false;
                        break;
                    }
                }
            }
            return result;
        }
    public static boolean isPalindromeStringBuilderWay(String word) {
        word=word.toLowerCase();
        boolean result=false;
        StringBuilder stringBuilderWord=new StringBuilder(word);
        if(stringBuilderWord.reverse().toString().equals(word)){
            result=true;
        }
        return result;
    }

    public static boolean isPalindromeRecursiveWay(String word) {
       // word="pollom";
        word=word.toLowerCase();
       boolean result=recursivePalindrome(word, 0, word.length()-1);
       return result;
    }

    public static boolean recursivePalindrome(String word, int indexRight, int indexLeft) {

        if (indexRight >= indexLeft) {
           return true;
        }
        else if(word.charAt(indexRight)!=word.charAt(indexLeft)){
           return false;
        }
        else   {
            return recursivePalindrome(word, indexRight+1,indexLeft-1);
        }

    }
}
