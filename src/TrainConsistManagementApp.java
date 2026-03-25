import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=====================================");
        System.out.println("   Train Consist Management App   ");
        System.out.println("=====================================\n");

        // Create dynamic list to store bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial message
        System.out.println("Train initialized successfully...");

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Display current train state
        System.out.println("Current train consist: " + trainConsist);
    }
}