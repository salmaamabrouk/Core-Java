/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcountries;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salmamabrouk
 */
public class WorldCountries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("USA", "United States", "North America", 9.8, 331000000, 21400000, new City(1, "Washington DC", 700000, "USA")));
        countries.add(new Country("CAN", "Canada", "North America", 9.9, 37590000, 1700000, new City(2, "Ottawa", 1000000, "CAN")));
        countries.add(new Country("MEX", "Mexico", "North America", 1.9, 128900000, 1070000, new City(3, "Mexico City", 21000000, "MEX")));
        countries.add(new Country("BRA", "Brazil", "South America", 8.5, 209500000, 2020000, new City(4, "Brasília", 3000000, "BRA")));
        countries.add(new Country("ARG", "Argentina", "South America", 2.8, 44000000, 923000, new City(5, "Buenos Aires", 3000000, "ARG")));
    
    }

}
