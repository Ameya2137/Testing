public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static ResultSet getProjects() throws SQLException {
        return executeQuery("SELECT * FROM Projects");
    }

    public static ResultSet getPowerPurchaseAgreements() throws SQLException {
        return executeQuery("SELECT * FROM PowerPurchaseAgreements");
    }

    public static ResultSet getSolarPanelData() throws SQLException {
        return executeQuery("SELECT * FROM SolarPanelData");
    }

    public static ResultSet getStateSubsidies() throws SQLException {
        return executeQuery("SELECT * FROM StateSubsidies");
    }

    public static ResultSet getSolarIntensity() throws SQLException {
       return executeQuery("SELECT * FROM SolarIntensity");
    }

    public static ResultSet getSolarPanelModels() throws SQLException {
       return executeQuery("SELECT panel_id, brand, model_name, power_output, cost_per_panel, length, width FROM SolarPanelModels");
    }

