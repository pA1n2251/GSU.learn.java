package com.gsu.lernJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void  main(String[] args){
        ArrayList<Computer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of computer: ");
        int counter = input.nextInt();
        for (int i = 0; i < counter; i++){
            System.out.print("Input " + (i+1) + " CPU frequency: ");
            float cpuFrequency = input.nextFloat();
            System.out.print("Input " + (i+1) + " RAM: ");
            int ram = input.nextInt();
            System.out.print("Input " + (i+1) + " Video card memory: ");
            float videoCard = input.nextFloat();
            Computer temp = new Computer(cpuFrequency, ram, videoCard);
            list.add(temp);
        }
        for (int i = 0; i < counter; i++) {
            System.out.println(list.get(i).toString());
        }


    }
}
