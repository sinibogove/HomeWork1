package qa.automation;

import java.util.Objects;
import java.util.Scanner;

public class MyHomeWork {
    public static void main(String[] args){
                System.out.println("Please, enter your first name!");

            Scanner scanner  = new Scanner(System.in);
                String firstName = scanner.next();
                System.out.println(firstName  + " is a very nice name.");
                System.out.println("Do you have a hobby?");

                String hobby = scanner.next();

                if (hobby.equals("yes")) {
                    System.out.println("What is your hobby?");
                    String hobbyType = scanner.next();
                    System.out.println(hobbyType+ " is a wonderful hobby.");
            }
                if (hobby.equals("no")) {
                    System.out.println("How pity! You must be living a boring life?");
            }
        }
        }

