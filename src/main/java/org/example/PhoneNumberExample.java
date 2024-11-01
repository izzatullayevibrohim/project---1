package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PhoneNumberExample {
    public static void main(String[] args) {
        System.out.print("Enter your phone number: ");
        String email = new Scanner(System.in).nextLine();





        Pattern pattern = Pattern.compile("\\+998\\s?\\(?\\d{2}\\)?\\s?\\d{3}\\s?\\d{2}\\s?\\d{2}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            System.out.println("Phone number correct");
        } else {
            System.out.println("Incorrect Phone number");
        }
    }
}