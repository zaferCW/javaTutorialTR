package ch30_Collections.emailCreation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("name alalim");

        String name =input.nextLine();
        System.out.println("last name alalim");

        String lastName =input.nextLine();
        EmailApp  email1 = new EmailApp(name , lastName);


        System.out.println("email1 = " + email1);


    }
}
