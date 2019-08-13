public class BookShelfUnLimitedIterator implements Iterator {
    private BookShelfUnLimited bookShelfUnLimited;
    private int index;

    public BookShelfUnLimitedIterator(BookShelfUnLimited bookShelfUnLimited) {
        this.bookShelfUnLimited = bookShelfUnLimited;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (bookShelfUnLimited.getLength() > index) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelfUnLimited.getBookAt(index);
        index++;
        return book;
    }
}
