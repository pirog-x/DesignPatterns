package creational.factory.method.control;

import creational.factory.method.control.books.MysteryBook;

public class MysteryBookShop extends BookShop {
    @Override
    public Book createBook() {
        return new MysteryBook();
    }
}
