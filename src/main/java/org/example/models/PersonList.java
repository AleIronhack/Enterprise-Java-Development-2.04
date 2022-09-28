package org.example.models;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PersonList {

    List<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(Person person) {
        this.personList.add(person);
    }

    public Person findByName(String name){
        String[] input = name.split(" ");
        if(input.length != 2) throw new IllegalArgumentException("El nombre esta formateado incorrectamente");

        for(Person p : personList){
            if(p.getName().equals(name))
                return p;
        }
        throw new NoSuchElementException("El nombre no existe");
    }






}
