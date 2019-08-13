/*具体的集合*/
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int i) {
        return books[i];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() { return last; }

    //iterator方法返回Iterator而不是BookShelfIterator屏蔽不同的实现类，iterator组件化复用，所有类都可以用iterator来遍历
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
