package creational.factory.method.control;


import creational.factory.method.control.books.FictionBook;

public class FictionBookShop extends BookShop {
    @Override
    public Book createBook() {
        return new FictionBook();
    }
}
