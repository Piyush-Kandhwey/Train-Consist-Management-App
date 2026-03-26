import java.util.LinkedList;

public class TrainManagement {
    public static void main(String[] args) {
        // Create a LinkedList to model the physical chain of the train
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("--- Railway Physical Chaining System ---");

        // 1. ADD: Building the basic train structure
        trainConsist.add("Sleeper (S1)");
        trainConsist.add("AC Coach (B1)");
        trainConsist.add("General Coach (G1)");

        // 2. addFirst / addLast: Positioning the Engine and Guard
        trainConsist.addFirst("Locomotive (WAP-7)");
        trainConsist.addLast("Guard Coach");

        System.out.println("Status: Initial train assembled.");
        System.out.println("Current Sequence: " + trainConsist);

        // 3. INSERTION: Adding a Pantry Car at a specific position (Index 2)
        System.out.println("\nAction: Inserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry Car");

        // 4. REMOVAL: Detaching from head and tail
        System.out.println("Action: Detaching Locomotive and Guard Coach for maintenance...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 5. DISPLAY: Final ordered state
        System.out.println("\n--- Final Ordered Consist ---");
        System.out.println("Total Bogies: " + trainConsist.size());

        // Iterating to show the chain
        for (int i = 0; i < trainConsist.size(); i++) {
            System.out.print("[" + trainConsist.get(i) + "]");
            if (i < trainConsist.size() - 1) System.out.print(" <-> ");
        }
        System.out.println("\n\nNote: LinkedList effectively models the 'Coupler' system of a real train.");
    }
}