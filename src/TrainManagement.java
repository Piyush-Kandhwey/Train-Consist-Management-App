// 1. CUSTOM EXCEPTION: Define a specific error for the Railway Domain
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 2. DOMAIN OBJECT: PassengerBogie with built-in validation
class PassengerBogie {
    String type;
    int capacity;

    // The constructor "throws" the exception if validation fails
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid Capacity: " + capacity +
                    ". Capacity must be greater than zero for " + type + ".");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (Seats: " + capacity + ")";
    }
}

public class TrainManagement {
    public static void main(String[] args) {
        System.out.println("--- Railway Data Integrity System ---");

        // 3. TRY-CATCH: Handling the creation process safely
        try {
            System.out.println("Action: Attempting to add a valid Sleeper bogie...");
            PassengerBogie s1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Success: Added " + s1);

            System.out.println("\nAction: Attempting to add an invalid AC bogie (0 capacity)...");
            // This line will trigger the exception and jump to the catch block
            PassengerBogie b1 = new PassengerBogie("AC Chair Car", 0);
            System.out.println("This line will never execute.");

        } catch (InvalidCapacityException e) {
            // 4. ERROR HANDLING: Gracefully reporting the business rule violation
            System.err.println("ALERT: " + e.getMessage());
        }

        try {
            System.out.println("\nAction: Attempting to add a bogie with negative capacity...");
            PassengerBogie f1 = new PassengerBogie("First Class", -5);
        } catch (InvalidCapacityException e) {
            System.err.println("ALERT: " + e.getMessage());
        }

        System.out.println("\nStatus: System remained stable despite invalid input attempts.");
    }
}