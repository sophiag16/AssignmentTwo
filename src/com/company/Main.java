package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter no. of asterisks");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while(num-->0)
        {
            System.out.print("*");
        }
    }
}