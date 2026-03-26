import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Reusing the Bogie class structure
class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "[Capacity: " + capacity + "]";
    }
}

public class TrainGroupingManager {
    public static void main(String[] args) {
        // 1. DATA SETUP: Creating a list with multiple bogies of the same type
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair Car", 56));
        trainConsist.add(new Bogie("First Class", 24));
        trainConsist.add(new Bogie("AC Chair Car", 56));

        System.out.println("--- Railway Inventory Grouping System ---");
        System.out.println("Processing " + trainConsist.size() + " bogies into categories...");

        // 2. STREAM PIPELINE: Grouping by Bogie Type
        // The classifier function (Bogie::type) determines the Map keys
        Map<String, List<Bogie>> groupedBogies = trainConsist.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // 3. DISPLAY: Iterating through the Map to show structured results
        System.out.println("\n--- Categorized Train Report ---");
        groupedBogies.forEach((type, list) -> {
            System.out.println("Category: " + type);
            System.out.println("Count: " + list.size());
            System.out.println("Details: " + list);
            System.out.println("---------------------------------");
        });

        // 4. INTEGRITY CHECK
        System.out.println("Total Categories Identified: " + groupedBogies.size());
        System.out.println("Status: Flat list successfully transformed into structured Map.");
    }
}