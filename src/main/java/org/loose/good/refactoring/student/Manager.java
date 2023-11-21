package org.loose.good.refactoring.student;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    public List<String> getPeopleNames(List<Person> people) {
        List<Person> overagePeople = keepOveragePeople(people);

        List<String> overagePeopleNames = getPeopleFullNames(overagePeople);

        overagePeopleNames = sortNamesAlphabetically(overagePeopleNames);

        printNames(overagePeopleNames);

        return overagePeopleNames;
    }

    private static void printNames(List<String> overagePeopleNames) {
        for (String s : overagePeopleNames) System.out.println(s);
    }

    private List<String>  sortNamesAlphabetically(List<String> names) {
        List<String> sortedNames = new ArrayList<>(names);
        for (int i = 0; i < sortedNames.size(); i++) {
            for (int j = i; j < sortedNames.size(); j++) {
                if (sortedNames.get(i).compareToIgnoreCase(sortedNames.get(j)) > 0) {
                    String aux = sortedNames.get(j);
                    sortedNames.set(j, sortedNames.get(i));
                    sortedNames.set(i, aux);
                }
            }
        }
        return sortedNames;
    }

    private List<String> getPeopleFullNames(List<Person> overagePeople) {
        List<String> stringList = new ArrayList<>();

        for (Person p : overagePeople) {
            String s1 = p.getFirstName() + " " + p.getLastName();
            stringList.add(s1);
        }
        return stringList;
    }

    private List<Person> keepOveragePeople(List<Person> people) {
        ArrayList<Person> overagePeople = new ArrayList<>();
        for (Person person : people) {
            int x = person.getAge();
            if (x >= 18) {
                overagePeople.add(person);
            }
        }
        return overagePeople;
    }
}