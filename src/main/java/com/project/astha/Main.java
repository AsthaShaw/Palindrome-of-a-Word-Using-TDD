package com.project.astha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the word for whom you would want to check the palindrome:");
        String word=scanner.next();
        try {
          if(WordPalindrome.isWordValid(word)){
              System.out.println(word+" is a palindrome");
          }
          else{
              System.out.println(word+" is a not palindrome");
          }
        }catch(NullPointerException | IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}