import java.util.ArrayList;
import java.util.List;

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
        // 1. DATA SETUP: Defining the train consist
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair Car", 56));
        trainConsist.add(new Bogie("First Class", 24));
        trainConsist.add(new Bogie("General", 90));

        System.out.println("--- Railway Capacity Analytics Dashboard ---");
        System.out.println("Analyzing " + trainConsist.size() + " bogies...");

        // 2. STREAM PIPELINE: Map and Reduce
        // .map(b -> b.capacity) transforms Bogie objects into a stream of Integers
        // .reduce(0, Integer::sum) starts at 0 and adds every capacity to the running total
        int totalSeats = trainConsist.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // 3. DISPLAY: Showing the aggregated metric
        System.out.println("\n--- Operational Summary ---");
        System.out.println("Total Passenger Capacity: " + totalSeats + " seats");

        // 4. BUSINESS LOGIC: Simple validation/insight
        if (totalSeats > 300) {
            System.out.println("Classification: High-Capacity Express Train");
        } else {
            System.out.println("Classification: Short-Distance Commuter Train");
        }

        // 5. INTEGRITY CHECK
        System.out.println("\nIntegrity Check: Original consist of " + trainConsist.size() + " bogies remains unchanged.");
        System.out.println("Status: Analytic computation successful.");
    }
}