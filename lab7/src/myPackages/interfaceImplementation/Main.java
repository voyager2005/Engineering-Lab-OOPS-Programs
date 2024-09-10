package myPackages.interfaceImplementation;

public class Main {
    public static void main(String[] args) {
        ByTwos series = new ByTwos();

        // Set the starting value
        series.setStart(0);

        // Display the first 10 numbers in the series
        for (int i = 0; i < 10; i++) {
            System.out.println("Next number: " + series.getNext());
        }

        // Reset the series
        series.reset();
        System.out.println("Series reset.");

        // Display the next 5 numbers in the series after reset
        for (int i = 0; i < 5; i++) {
            System.out.println("Next number: " + series.getNext());
        }
    }
}
