/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcountries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author salmamabrouk
 */
public class Country {

    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private int population;
    private double gnp;
    private City capital;
    private List<City> cities;

    public Country(String code, String name, String continent, double surfaceArea, int population, double gnp, City capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.population = population;
        this.gnp = gnp;
        this.capital = capital;
        this.cities = new ArrayList<>();
    }

    Country(String usa, String united_States, String north_America, double d, int i, int i0, City city) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public void addCity(City city) {
        cities.add(city);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public int getPopulation() {
        return population;
    }

    public double getGnp() {
        return gnp;
    }

    public City getCapital() {
        return capital;
    }

    public List<City> getCities() {
        return cities;
    }

    public City getHighestPopulatedCity() {
        return cities.stream().max(Comparator.comparingInt(City::getPopulation)).orElse(null);
    }
}

