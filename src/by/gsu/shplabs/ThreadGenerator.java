package by.gsu.shplabs;

public class ThreadGenerator {
    enum Action{
        MUL{
            @Override
            int perform(int num1, int num2) {
                return num1*num2;
            }
        },
        ADD{
            @Override
            int perform(int num1, int num2) {
                return num1+num2;
            }
        },
        SUB{
            @Override
            int perform(int num1, int num2) {
                return num1-num2;
            }
        };

        abstract int perform(int num1, int num2);
        int calculate(CalculatorThread[] calculatorThreads){
            int globalResult = 0;
            int startResult = 0;
            if (this == MUL){
                globalResult = calculatorThreads[0].result;
                startResult = 1;
            }
            for (int i = startResult; i < calculatorThreads.length;i++){
                globalResult = perform(globalResult, calculatorThreads[i].result);
            }
            return globalResult;
        }
    }
    private final static int NUMBER_OF_THREADS = 2;
    private Action action = Action.ADD;
    private CalculatorThread[] threads;

    public void execute(){
        threads = new CalculatorThread[NUMBER_OF_THREADS];
        for (int i = 0; i<threads.length; i++){
            threads[i] = new CalculatorThread();
            Thread thread = new Thread(threads[i]);
            thread.run();
        }
    }

    public int getResult() {
        return action.calculate(threads);
    }
}
