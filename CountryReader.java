package org.fasttrackit.firstSpring.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

@Component
public class CountryReader {
    public static List<CountiresObject> readCountries(String filePath) throws FileNotFoundException {
        List<CountiresObject> countiresObjects = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        int id = 1;
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String [] tokens = line.split(Pattern.quote("|"));
            countiresObjects.add(new CountiresObject( tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), tokens[4], tokens[5].split(Pattern.quote("~"))));
            id++;
        }
        return countiresObjects;

    }
}
