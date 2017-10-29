package com.gsu.lernJava;

import java.io.*;
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

        File file = new File("src"+ File.separator + "Computer.bin");

        try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Computer comp: list)
                System.out.println(comp);
            oo.writeObject(list);
            oo.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Data has been recorded!");
        System.out.println("Reading...");

        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream(file))){
            System.out.println("New list created");
            ArrayList<Computer> list2 = (ArrayList<Computer>)oi.readObject();
            for (int i = 0; i < counter; i++) {
                System.out.println(list2.get(i));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
