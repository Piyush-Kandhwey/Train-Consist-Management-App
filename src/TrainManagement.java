import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Reusing the Bogie class concept from UC7
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("%-15s | Capacity: %d seats", name, capacity);
    }
}

public class TrainManagement {
    public static void main(String[] args) {
        // 1. DATA SETUP: Creating the master list of bogies
        List<Bogie> allBogies = new ArrayList<>();
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("AC Chair Car", 56));
        allBogies.add(new Bogie("First Class", 24));
        allBogies.add(new Bogie("General", 90));

        System.out.println("--- Railway Intelligence & Filtering ---");
        System.out.println("Total Bogies in System: " + allBogies.size());

        // 2. STREAM PIPELINE: Filtering for high-capacity bogies (> 60)
        // .stream() -> starts the pipeline
        // .filter() -> applies the business rule (Lambda)
        // .collect() -> bundles the result into a new list
        int threshold = 60;
        List<Bogie> highCapacityBogies = allBogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());

        // 3. DISPLAY: Showing filtered results
        System.out.println("\nAction: Filtering bogies with capacity > " + threshold + "...");

        if (highCapacityBogies.isEmpty()) {
            System.out.println("Result: No bogies match the criteria.");
        } else {
            System.out.println("Filtered Results:");
            highCapacityBogies.forEach(System.out::println);
        }

        // 4. INTEGRITY CHECK: Verifying the original list is untouched
        System.out.println("\nIntegrity Check: Original list size remains " + allBogies.size());
        System.out.println("Status: Stream processing completed successfully.");
    }
}