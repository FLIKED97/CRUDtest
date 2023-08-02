package org.testCRUD.app.dao;

import org.springframework.stereotype.Component;
import org.testCRUD.app.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT;

    {
        people = new ArrayList<>();

        people.add(new Person(1, "Sacha"));
        people.add(new Person(2, "Illa"));
        people.add(new Person(3, "Dania"));
        people.add(new Person(4, "Kirilo"));

    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
