package creational.factory.method.control;

public abstract class BookShop {
    public void displayBook() {
        Book book = createBook();
        book.displayInfo();
    }

    public abstract Book createBook();
}
