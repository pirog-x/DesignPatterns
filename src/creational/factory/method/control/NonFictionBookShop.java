package creational.factory.method.control;

import creational.factory.method.control.books.NonFictionBook;

public class NonFictionBookShop extends BookShop {
    @Override
    public Book createBook() {
        return new NonFictionBook();
    }
}
