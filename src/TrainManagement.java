import java.util.ArrayList;

public class TrainManagement {
    public static void main(String[] args) {
        // Create an ArrayList to store passenger bogies dynamically
        ArrayList<String> passengerBogies = new ArrayList<>();

        System.out.println("--- Railway Consist Management System ---");

        // 1. ADD: Attaching bogies to the engine
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair Car");
        passengerBogies.add("First Class");

        System.out.println("Status: Bogies added successfully.");
        System.out.println("Current Consist: " + passengerBogies);

        // 2. REMOVE: Detaching a bogie (e.g., for maintenance or route change)
        String bogieToRemove = "AC Chair Car";
        passengerBogies.remove(bogieToRemove);

        System.out.println("\nAction: Detaching " + bogieToRemove + "...");
        System.out.println("Updated Consist: " + passengerBogies);

        // 3. CONTAINS: Checking for a specific bogie type
        String searchBogie = "Sleeper";
        System.out.println("\nVerification: Checking for " + searchBogie + " bogie...");

        if (passengerBogies.contains(searchBogie)) {
            System.out.println("Result: " + searchBogie + " is present in the train.");
        } else {
            System.out.println("Result: " + searchBogie + " not found.");
        }

        // 4. READ: Final state and size
        System.out.println("\n--- Final Train Summary ---");
        System.out.println("Total Bogies: " + passengerBogies.size());
        System.out.println("Final Composition: " + passengerBogies);
    }
}