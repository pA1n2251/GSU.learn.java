package by.gsu.shplabs;

import java.util.Scanner;

public class CalculatorThread implements Runnable{
    public int result = 1;
    private final int ceil;

    public CalculatorThread(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input multiplying upper bound: ");
        ceil = in.nextInt();
    }

    @Override
    public void run() {
        for (int i = result; i < ceil + 1; i++) {
            if (i%4==0){
                result *= i;
            }
        }
    }
}
