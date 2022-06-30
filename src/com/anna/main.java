package com.anna;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter total marks of an individual subject:");
        int marks = input.nextInt();

        System.out.println("marks in subject 1:");
        float marks1 = input.nextFloat();

        System.out.println("marks in subject 2:");
        float marks2 = input.nextFloat();

        System.out.println("marks in subject 3:");
        float marks3 = input.nextFloat();

        System.out.println("marks in subject 4:");
        float marks4 = input.nextFloat();

        System.out.println("marks in subject 5:");
        float marks5 = input.nextFloat();

        System.out.println("marks obtained:");
        float sum = marks1 + marks2 + marks3 + marks4 + marks5;
        System.out.println(sum);

        System.out.println("your percentage is:");
        float percentage = sum/(marks*5) *100;
        System.out.println(percentage);


    }

}
