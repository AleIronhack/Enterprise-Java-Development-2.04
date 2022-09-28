package org.example.models;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Person {

    private int id;
    private String name;
    private int age;
    private String occupation;

    private static int counter = 0;

    public Person(String name, int age, String occupation) {
        setId(counter);
        this.name = name;
        setAge(age);
        this.occupation = occupation;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) throw new IllegalArgumentException();
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public static Person clone(Person person){
        Person clone = new Person(person.getName(), person.getAge(), person.getOccupation());
        return clone;
    }

    public static void writeToFile(Person person) throws IOException {
        FileWriter writer = new FileWriter("person.txt");
        writer.write(person.toString());
        writer.close();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(occupation, person.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, occupation);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
