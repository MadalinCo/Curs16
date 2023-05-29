package org.fasttrackit.firstSpring.homework;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CountiresObject {
    @Override
    public String toString() {
        return "CountiresObject{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", continent='" + continent + '\'' +
                ", neighbors=" + Arrays.toString(neighbors) +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    public String getContinent() {
        return continent;
    }

    public String[] getNeighbors() {
        return neighbors;
    }

    public CountiresObject(String name, String capital, int population, int area, String continent, String[] neighbors) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
        this.neighbors = neighbors;
    }

    private String name;
    private String capital;
    private int population;
    private int area;
    private String continent;
    private String[] neighbors;



}
