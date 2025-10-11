public class EvenOddPrinter {
    private int number = 1;
    private final int limit;

    public EvenOddPrinter(int limit) {
        this.limit = limit;
    }

    public void printEven() {
        synchronized (this) {
            while (number <= limit) {
                // Wait for an even number
                if (number % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        e.printStackTrace();
                    }
                }
                // Print and increment
                if (number <= limit) {
                    System.out.println("Even: " + number);
                    number++;
                    notify(); // Notify the waiting odd thread
                }
            }
        }
    }

    public void printOdd() {
        synchronized (this) {
            while (number <= limit) {
                // Wait for an odd number
                if (number % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        e.printStackTrace();
                    }
                }
                // Print and increment
                if (number <= limit) {
                    System.out.println("Odd: " + number);
                    number++;
                    notify(); // Notify the waiting even thread
                }
            }
        }
    }

    public static void main(String[] args) {
    	// Take the max number as an arg in constructor
        EvenOddPrinter printer = new EvenOddPrinter(20);

        Thread evenThread = new Thread(() -> {
            printer.printEven();
        });

        Thread oddThread = new Thread(() -> {
            printer.printOdd();
        });

        evenThread.start();
        oddThread.start();
    }
}
