package com.gsu.lernJava;

public class Runner {

    public static void main(String args[]){
        Auto[] autos = {
                new Auto("Rino", "Karb", 380, 1800, 1000),
                new Car("Rino", "Diz", 140, 1200, 4000, 6.3f, 10),
                new Truck("MAN", "Karb", 540, 3100, 40000, 5, "close"),
                new Bus("BMZ", "Diz", 430, 2200, 3400, 128),
                new Auto(),
                new Car(),
                new Bus(),
                new Truck("Rino", "Karb", 380, 1800, 1000),
                new Car("Rino", "Karb", 380, 1800, 1000),
                new Bus("Rino", "Karb", 380, 1800, 1000)
        };

        for (int i=0; i<autos.length; i++){
            System.out.println(autos[i].toString()) ;
            autos[i].model();
        }
    }
}
