package creational.prototype.control.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    private List<Book> books = new ArrayList<>();
    
    public BookShop(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("Book: " + i);
            books.add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public BookShop clone() throws CloneNotSupportedException {
        BookShop cloneBookShop = new BookShop(shopName);

        List<Book> copyBooks = new ArrayList<>(books.size());
        copyBooks.addAll(books);
        cloneBookShop.setBooks(copyBooks);

        return cloneBookShop;
    }
}
