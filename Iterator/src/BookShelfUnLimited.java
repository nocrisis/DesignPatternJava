import java.util.ArrayList;

public class BookShelfUnLimited implements Aggregate {
    private ArrayList books;

    public BookShelfUnLimited() {
        this.books = new ArrayList<Book>();
    }

    public int getLength() {
        return books.size();
    }

    public Book getBookAt(int i) {
        return (Book) books.get(i);
    }

    public void addBook(Book book, int i) {
        if (i > getLength() + 1) {
            books.add(i + 1, book);
        } else {
            books.add(i, book);
        }
    }

    @Override
    public Iterator iterator() {
        return new BookShelfUnLimitedIterator(this);
    }
}
