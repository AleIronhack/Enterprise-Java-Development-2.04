package org.example;

import org.example.models.Person;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Max Bonas", 33, "Teacher");

        try {
            Person.writeToFile(person1);
        } catch (IOException e){
            System.err.println(e.getMessage());
        }



    }
}