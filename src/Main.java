package src;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// File name and class must be identical to each other, otherwise it will cause errors
public class Main {
    // Entry point to our program - boilerplate
    public static void main(String[] args) {

        // System.out.println("Hello World! It's me, Shaq");

        // Primitive Types
        int studentAge = 15;
        double studentGPA = 3.45;
        // char studentFirstInitial = 'K';
        // char studentLastInitial = 'H';
        boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(hasPerfectAttendance);

        // Reference Types
        String studentFirstName = "Shaq";
        String studentLastName = "Quack";
        System.out.println(studentFirstName + " " + studentLastName);

        // Special Operations

        // charAt
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);

        // Concatenation
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);

        // Dynamically updating data via Input - Scanner
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);

    }
}