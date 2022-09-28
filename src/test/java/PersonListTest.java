import org.example.models.Person;
import org.example.models.PersonList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonListTest {

    Person person1;
    Person person2;
    Person person3;

    PersonList personList;

    @BeforeEach
    void setUp(){
        person1 = new Person("Max Bonas", 33, "Teacher");
        person2 = new Person("Armando Medina", 33, "Youtuber");
        person3 = new Person("Oscar Curto", 33, "Mecánico");

        personList = new PersonList();

        personList.setPersonList(person1);
        personList.setPersonList(person2);
        personList.setPersonList(person3);


    }

    @Test
    @DisplayName("Search for a user in a list")
    void check_name_returns_exception(){
        assertThrows(IllegalArgumentException.class, ()-> personList.findByName("Max"));
        assertEquals(person1, personList.findByName("Max Bonas"));
        assertThrows(NoSuchElementException.class, ()-> personList.findByName("asd asd"));

    }


}
