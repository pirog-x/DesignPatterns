package creational.prototype.control;

import creational.prototype.control.prototype.BookShop;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop("Bob Book");
        bookShop.loadData();

        BookShop bookShop1 = (BookShop) bookShop.clone();
        bookShop1.getBooks().removeAll(bookShop1.getBooks());

        if (bookShop1 == bookShop) {
            System.out.println("bookShop1 == bookShop");
        } else {
            System.out.println("bookShop1 != bookShop");
        }

        System.out.println(bookShop);
        System.out.println(bookShop1);
    }
}
