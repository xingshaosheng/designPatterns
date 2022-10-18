package Structured.filter.pattern.criteria;

import Structured.filter.pattern.Person;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
