public class Test {
    public static void main(String[] args) {
        /*BookShelf bookShelf = new BookShelf(6);
        bookShelf.appendBook(new Book("接电话心理"));
        bookShelf.appendBook(new Book("热违法调查"));
        bookShelf.appendBook(new Book("混凝土以及挖机"));
        bookShelf.appendBook(new Book("银行卡通"));
        //iterator方法返回Iterator而不是BookShelfIterator屏蔽不同的实现类，iterator组件化复用，所有类都可以用iterator来遍历
        Iterator iterator = bookShelf.iterator();
        //while循环并不依赖bookShelf的实现，将遍历与实现分开来
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }*/

        BookShelfUnLimited bookShelfUnLimited = new BookShelfUnLimited();
        bookShelfUnLimited.addBook(new Book("不好鸡蛋饼吃顿饭"),0);
        bookShelfUnLimited.addBook(new Book("和我UI有和"),1);
        bookShelfUnLimited.addBook(new Book("请参考佳木斯"),1);
        bookShelfUnLimited.addBook(new Book("披萨店凤凰网IQ"),2);
        Iterator iterator = bookShelfUnLimited.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
