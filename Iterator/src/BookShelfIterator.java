/*具体的迭代器*/
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;//当前所指书的下标

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {//>=最后一个元素返回false
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
