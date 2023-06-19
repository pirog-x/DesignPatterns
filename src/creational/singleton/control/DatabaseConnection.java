package creational.singleton.control;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;

    public static DatabaseConnection getInstance() {
        DatabaseConnection result = instance;
        if (result == null) {
            synchronized (DatabaseConnection.class) {
                result = instance;
                if (result == null) {
                    instance = result = new DatabaseConnection();
                }
            }
        }
        return result;
    }

    public void connect() {
        System.out.println("Connected to database.");
    }

    public void disconnect() {
        System.out.println("Disconnected from database.");
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: '" + query + "'");
    }
}
