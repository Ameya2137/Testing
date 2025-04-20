import java.sql.*;
import java.util.Scanner;

public class StateSubsidy {
    public static void run(Scanner scanner) { // Accept the scanner as an argument
        System.out.print("Enter state name: ");
        String stateName = scanner.nextLine();  // Use the passed scanner
        
        try {
            ResultSet rs = DatabaseHelper.getStateSubsidies();
            boolean hasData = false;

            while (rs.next()) {
                if (rs.getString("state_name").equalsIgnoreCase(stateName)) {
                    hasData = true;
                    System.out.println("State: " + rs.getString("state_name"));
                    System.out.println("Subsidy Percentage: " + rs.getFloat("subsidy_percent") + "%");
                    System.out.println("--------------------------------------");
                }
            }

