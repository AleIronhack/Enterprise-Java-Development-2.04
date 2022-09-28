import org.example.models.Person;
import org.example.models.PersonList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {


    Person person1;



    @BeforeEach
    void setUp(){
        person1 = new Person("Max Bonas", 33, "Teacher");
    }

    @Test
    @DisplayName("Comprar que la edad no puede ser menor que 0")
    void age_cannot_be_less_0(){
        //Person personTest = new Person(1, "Alejandro", 34, "TA");
        //assertThrows(IllegalArgumentException.class, () -> personTest.setAge(-1));
        assertThrows(IllegalArgumentException.class, () -> new Person("Alejandro", -1, "TA"));
    }

    @Test
    @DisplayName("Clonar Person")
    void clone_check_differentId(){
        Person clone = Person.clone(person1);

        assertFalse(person1.getId() == clone.getId());
        assertTrue(person1.equals(clone));
    }
}
