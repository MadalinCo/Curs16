package org.fasttrackit.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class PersonService {
    public static void main(String[] args) {



        //System.out.println(allThePersonsNames());
        //System.out.println(personsOverEighteen());
        System.out.println(sortPersonInThreeWays());

    }
    static List<Person> people = List.of(
            new Person("Andrei", "Popescu", 21, "Bucuresti"),
            new Person("Marian", "Ionescu", 32, "Cluj-Napoca"),
            new Person("Alin", "Pop", 26, "Braila")
    );


        public static List<String> allThePersonsNames () {
            List<String> listOfFirstName = people.stream().map(person -> person.firstName).toList();
            List<String> listOfLastName = people.stream().map(person -> person.lastName).toList();


            return listOfFirstName;//+ listOfLastName,   HOW??
        }
        public static List<Person> personsOverEighteen() {
            List<Person> personsOverEighteen = people.stream().filter(person -> person.age > 18).toList();
            return personsOverEighteen;

        }
        public static List<Person> personsFromOradea(){
            List<Person> oradealist = people.stream().filter(person -> person.city.equals("Oradea")).toList();
           // System.out.println(new String(oradealist.toString()));

            return oradealist;
        }

        public static List<Person> personsFromOradeaOrCluj(){
            List<Person> oradedaOrClujList = people.stream().filter(person -> person.city.equals("Oradea") || person.city.equals("Cluj-Napoca")).toList();

            return oradedaOrClujList;
        }
        public static List<String> allFirstNamesCaps(){
            List<String> firstNameToCaps = people.stream().map(person -> person.firstName.toUpperCase(Locale.ROOT)).toList();
            return firstNameToCaps;
        }

        public static List<String> firstNameAndFirstLetterFromLastName(){
            List<String> list1 = people.stream().map(person -> person.firstName).toList();
            List<String> list2 = people.stream().map(person -> Arrays.toString(person.lastName.toCharArray())).toList();
        return list2;

        }

        public static List<Person> personsOverEighteenAndUnderSixty(){
            List<Person> list = people.stream().filter(person -> person.age > 18&&person.age<60).toList();
            return list;
        }

        public static List<Person> personsWithFirstNameStartingWithA(){
            //people.stream().filter(person -> person.firstName.toCharArray().toString().equals(char[])).
           return null;

        }

        public static List<String> allFirstNamesUniquely(){
            List<String> list = people.stream().map(person -> person.firstName).distinct().toList();
            return list;
        }

        public static List<Person> sortPersonsByFirstName(){
            List<Person> list = people.stream().sorted(Comparator.comparing(person -> person.firstName)).toList();
            return list;
        }


    public static List<Person> sortPersonsByLastName(){
        List<Person> list = people.stream().sorted(Comparator.comparing(person -> person.lastName)).toList();
        return list;
    }

    public static List<Person> sortPersonInThreeWays(){
        List<Person> list = people.stream().sorted(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName).thenComparing(Person::getAge)).toList();
        return list;
    }










}


