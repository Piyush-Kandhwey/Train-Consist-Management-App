import java.util.HashSet;
import java.util.Set;

public class TrainManagement {
    public static void main(String[] args) {
        // Create a HashSet to store unique Bogie IDs
        // HashSet ensures no duplicate IDs can exist in the system
        Set<String> bogieIds = new HashSet<>();

        System.out.println("--- Railway ID Registration System ---");

        // 1. ADD: Registering bogies with unique IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        System.out.println("Status: Initial bogies registered.");
        System.out.println("Registered IDs: " + bogieIds);
S
        // 2. DUPLICATE ATTEMPT: Trying to add an existing ID (Simulating an error)
        System.out.println("\nAction: Attempting to register duplicate ID 'BG101'...");
        boolean isAdded = bogieIds.add("BG101");

        if (!isAdded) {
            System.out.println("Alert: Bogie ID 'BG101' already exists! Duplicate rejected.");
        }

        // 3. ADD: Adding another unique ID
        bogieIds.add("BG104");

        // 4. DISPLAY: Final unique set
        System.out.println("\n--- Final Unique Bogie Inventory ---");
        System.out.println("Total Unique Bogies: " + bogieIds.size());
        System.out.println("Inventory List: " + bogieIds);

        System.out.println("\nNote: Notice that the order may differ from insertion order " +
                "as HashSet does not guarantee sequence.");
    }
}