package co.com.example;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Provide the name:");
        String name = consola.nextLine();

        System.out.println("Provide the id:");
        int id = Integer.parseInt(consola.nextLine());

        System.out.println("Provide the price:");
        double price = Double.parseDouble(consola.nextLine());

        System.out.println("Provide free shipping (true/false)");
        boolean freeShipping = Boolean.parseBoolean(consola.nextLine());

        System.out.println(name + " #" + id);
        System.out.println("Price: $" + price);
        System.out.println("Free shopping: " + freeShipping);
    }
}
