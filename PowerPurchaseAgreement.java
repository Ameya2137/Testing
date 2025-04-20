// Validate user input
        try {
            validateState(stateName);
        } catch (InvalidStateException e) {
            System.err.println("" + e.getMessage());
            return; // stop execution if invalid
        }

          } catch (SQLException e) {
                System.err.println("Database Error: " + e.getMessage());
                e.printStackTrace();
            }
        };

        // Start the thread
        Thread ppaThread = new Thread(fetchPPAData);
        ppaThread.start();

        try {
            ppaThread.join(); // Wait for thread to complete
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }
    }

    // Validate against known states
    private static void validateState(String state) throws InvalidStateException {
        if (!VALID_STATES.contains(state)) {
            throw new InvalidStateException(
                "Invalid state or union territory entered.\n" +
                "Valid entries include: " + String.join(", ", VALID_STATES)
            );
        }
    }
}
