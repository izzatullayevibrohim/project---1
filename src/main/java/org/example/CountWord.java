package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWord {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter text: " );
        String text = scanner.nextLine();
        System.out.print("Enter word: ");
        String word = scanner.nextLine();
        int wordCount = 1;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        if (!matcher.find()){
            System.out.println("In this text -> " + text +  "\nthere isn't words like this word -> " + word);
        }else {
            while (matcher.find()){
                wordCount++;
            }
            System.out.println("In this text -> " + text + "count of this word -> " + word + " = " + wordCount);
        }
        main(args);
    }
}
