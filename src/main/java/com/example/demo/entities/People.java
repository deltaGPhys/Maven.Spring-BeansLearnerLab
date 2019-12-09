package com.example.demo.entities;

import java.util.*;
import java.util.function.Consumer;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{

    private List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add (PersonType person) {
        this.personList.add(person);
    }

    public void remove(PersonType person) {
        this.personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        this.personList.clear();
    }

    public void addAll (Iterable<PersonType> people) {
        this.personList.addAll((Collection<? extends PersonType>) people);
    }

    public PersonType findById (long id) {
        for (PersonType person : this.personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll () {
        return this.personList;
    }

    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }



    public Spliterator<PersonType> spliterator() {
        return null;
    }
}
