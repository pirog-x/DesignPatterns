package creational.singleton.control;

public class DatabaseConnectionDemo {
    public static void main(String[] args) {
        DatabaseConnection connector1 = DatabaseConnection.getInstance();
        DatabaseConnection connector2 = DatabaseConnection.getInstance();
        DatabaseConnection connector3 = DatabaseConnection.getInstance();

        connector1.connect();
        connector2.connect();
        connector3.connect();

        connector1.executeQuery("SELECT * FROM Users");
        connector2.disconnect();
        connector3.disconnect();
    }
}
