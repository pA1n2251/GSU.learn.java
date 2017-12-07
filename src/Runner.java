import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner {
    private static final String FILE_PATH = "src/data/in1.csv";
    private static final String PLUS = " + ";
    private static final String MINUS = " - ";

    public static void main(String[] args) {
        int numLine;
        int errorLines = 0;
        double element;
        double sum = 0;
        StringBuilder outputLine = new StringBuilder();
        try(Scanner sc = new Scanner(new FileReader(FILE_PATH))){
            while (sc.hasNext()){
                String[] elements = sc.nextLine().split(";");
                try {
                    numLine = Integer.parseInt(elements[0]);
                    element = Double.parseDouble(elements[numLine]);
                    sum += element;
                    outputLine.append(element<0 ? MINUS: PLUS).append(Math.abs(element));
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
                    errorLines++;
                }
            }
            if (outputLine.length() > 0) {
                final int SIGN_LENGTH = MINUS.length();
                final char CHAR_MINUS = '-';
                final int SIGN_POS = MINUS.indexOf(CHAR_MINUS);
                char symbol = outputLine.charAt(SIGN_POS);
                outputLine.delete(0, SIGN_LENGTH);
                if (symbol == CHAR_MINUS) {
                    outputLine.insert(0, CHAR_MINUS);
                }
            }
                System.out.println("result(" + outputLine + ") = " + sum);
            System.out.println("errors-line = " + errorLines);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
