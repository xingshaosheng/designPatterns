package Structured.filter.pattern.criteria;

import Structured.filter.pattern.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePerson = new ArrayList<>();
        for (Person person : persons)
            if(person.getGender().equalsIgnoreCase("male")) malePerson.add(person);
        return malePerson;
    }
}
