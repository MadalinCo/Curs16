package org.fasttrackit.firstSpring.homework;

import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Component
public class CountryService {
    private static final CountiresObject countiresObject;

    static {
        try {
            countiresObject = (CountiresObject) CountryReader.readCountries("files,countries.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static List<CountiresObject> countiresObjectList;
    public CountryService() throws FileNotFoundException {
    }
    public static List<CountiresObject> allCountriesInfo(){
        return countiresObjectList.stream().toList();
    }

   public static  List<String> countryNames(){
        return countiresObjectList.stream().map(CountiresObject::getName).toList();
   }

    public static String getCapitalOfCountry(String namedCountry){
        return countiresObjectList.stream().filter(countiresObject1 ->countiresObject.getName().equals(namedCountry)).toList().toString();
    }
    public static  long getPopulationOfCountry(String namedCountry){
        return 0;
        //return countiresObjectList.stream().filter(countiresObject1 ->  countiresObject.getName().equals(namedCountry)).toList();
    }
    public static List<CountiresObject> getCountriesInContinent(String continent){
        return countiresObjectList.stream().filter(countiresObject1 -> countiresObject.getContinent().equals(continent)).toList();
    }
    public static List<String > getCountryNeighbours(String country){
        return (List<String>) countiresObjectList.stream().filter(countiresObject ->countiresObject.getName().equals(country)).map(countiresObject ->countiresObject.getNeighbors()).toList();

    }
    public static List<CountiresObject> getCountriesInAContinentWithPopulationLargerThan(String continent, int population){
        return countiresObjectList.stream().filter(countiresObject->countiresObject.getContinent().equals(continent)).filter(countiresObject-> Objects.equals(countiresObject.getPopulation(), population)).toList();
    }

}


