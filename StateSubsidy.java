// b10
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
// b10
