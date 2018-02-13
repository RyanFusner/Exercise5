package com.fusner.Exercise5;

import java.util.ArrayList;


public class AddressBook
{
    private ArrayList<Contact> contacts;

    public AddressBook()
    {
        contacts = new ArrayList<>();
    }

    public void add(String name, String email)
    {
        contacts.add(new Contact(name, email));
    }

    public void remove(String name)
    {
        System.out.println();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name))
            {
                contacts.remove(i);
            }
        }
    }

    public void search(String name)
    {
        System.out.println();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name))
            {
                System.out.println(contacts.get(i).getName() + ": " + contacts.get(i).getEmail());
            }
        }
    }

    public void display()
    {
        System.out.println();
        for (int i = 0; i < contacts.size(); i++)
        {
            System.out.println(contacts.get(i).getName() + ": " + contacts.get(i).getEmail());
        }
    }
}
