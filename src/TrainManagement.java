import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
}

public class TrainManagement {
    public static void main(String[] args) {
        // 1. SETUP: Creating a larger dataset for meaningful measurement
        List<Bogie> trainConsist = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            trainConsist.add(new Bogie("Sleeper", 72));
            trainConsist.add(new Bogie("AC", 56));
        }

        System.out.println("--- Railway System Performance Lab ---");
        System.out.println("Dataset Size: " + trainConsist.size() + " Bogies");

        // 2. BENCHMARK: Traditional Loop Approach
        long startTimeLoop = System.nanoTime();
        List<Bogie> filteredLoop = new ArrayList<>();
        for (Bogie b : trainConsist) {
            if (b.capacity > 60) {
                filteredLoop.add(b);
            }
        }
        long endTimeLoop = System.nanoTime();
        long durationLoop = endTimeLoop - startTimeLoop;

        // 3. BENCHMARK: Java Stream Approach
        long startTimeStream = System.nanoTime();
        List<Bogie> filteredStream = trainConsist.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long endTimeStream = System.nanoTime();
        long durationStream = endTimeStream - startTimeStream;

        // 4. DISPLAY: Results and Comparison
        System.out.println("\n--- Performance Metrics ---");
        System.out.println("Loop Execution Time   : " + durationLoop + " ns");
        System.out.println("Stream Execution Time : " + durationStream + " ns");

        // Logic check: Ensure both results are identical
        if (filteredLoop.size() == filteredStream.size()) {
            System.out.println("\nIntegrity: Both methods produced " + filteredLoop.size() + " results.");
        }

        System.out.println("\nInsight: While Streams offer cleaner syntax, Loops often " +
                "provide lower overhead for simple filtering tasks.");
    }
}