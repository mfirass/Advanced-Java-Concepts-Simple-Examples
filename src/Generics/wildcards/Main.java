package Generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List of buildings
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);


        //List of offices
        List<Office> offices = new ArrayList<>();
        buildings.add(new Office());
        buildings.add(new Office());
        //wildcard here down bellow
        printBuildings(offices);


        //List of houses
        List<House> houses = new ArrayList<>();
        buildings.add(new House());
        buildings.add(new House());
        //wildcard here down bellow
        printBuildings(houses);



        addHouseToList(houses);
        //wildcard here down bellow
        addHouseToList(buildings);
    }

    //buildings here is an "in" variable
    static void printBuildings(List<? extends Building> buildings){
        int i = 0;
        for (Building building:buildings){
            System.out.println(i++);
        }
    }

    //buildings here is an "out" variable
    static void addHouseToList(List<? super House> buildings){
        buildings.add(new House());
    }
}
