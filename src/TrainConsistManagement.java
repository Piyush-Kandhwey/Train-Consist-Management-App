import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagement {
    private List<String> bogies = new ArrayList<>();

    /**
     * Searches for a specific bogie by ID.
     * Implements UC20: Defensive search validation.
     */
    public String findBogie(String bogieId) {
        // 1. State Validation (Fail-Fast)
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Search failed: The train has no bogies attached.");
        }

        // 2. Search Logic (Only executes if state is valid)
        for (String bogie : bogies) {
            if (bogie.equals(bogieId)) {
                return bogie;
            }
        }

        return null; // Bogie not found
    }
}