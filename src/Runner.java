import by.gsu.shplabs.*;

public class Runner {
    public static void main(String[] args) {
        ThreadGenerator generator = new ThreadGenerator();
        generator.execute();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Result of threads calculation: " + generator.getResult());
    }
}
