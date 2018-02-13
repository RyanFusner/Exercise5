package com.fusner.Exercise5;

import java.util.*;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    static AddressBook book = new AddressBook();

    public static void main(String[] args)
    {
        displayMenu();
        int choice = scanner.nextInt();

        while (choice != 0)
        {
            switch (choice)
            {
                case 1: add();
                    break;
                case 2: remove();
                    break;
                case 3: search();
                    break;
                case 4: display();
                    break;
            }
            displayMenu();
            choice = scanner.nextInt();
        }
    }

    static void add()
    {
        System.out.println("\nName:");
        String name = scanner.next();
        System.out.println("\nEmail:");
        book.add(name, scanner.next());
    }

    static void remove()
    {
        System.out.println("\nName: ");
        book.remove(scanner.next());
    }

    static void search()
    {
        System.out.println("\nName: ");
        book.search(scanner.next());
    }

    static void display()
    {
        book.display();
    }

    static void displayMenu()
    {
        System.out.println("\n(1) Add a contact.\n(2) Remove a contact.\n(3) Search for a contact.\n(4) List all contacts.\n(0) Exit.\nPlease choose an option:");
    }
}

