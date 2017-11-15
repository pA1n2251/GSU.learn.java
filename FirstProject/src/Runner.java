import by.gsu.labs.Kettle;

import java.io.*;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        TreeSet<Kettle> list = new TreeSet();

        //reading from file to collection
        try {
            BufferedReader input = new BufferedReader(new FileReader("src"+File.separator+"kettle_input.txt"));
            String line = null;
            while ((line = input.readLine()) != null) {
                String[] atbs = line.split(";");
                Kettle temp = new Kettle(atbs[0], Integer.parseInt(atbs[1]), Integer.parseInt(atbs[2]), Double.parseDouble(atbs[3]));
                list.add(temp);
            }
            input.close();
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        //writing from sorted collection to file
        try {
            FileWriter output = new FileWriter("src"+File.separator+"kettle_output.txt");
            for (Kettle tb: list) {
                output.write(tb.toString());
                output.write(System.lineSeparator());
            }
            output.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
