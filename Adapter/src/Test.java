

/*Client请求者，使用tardet方法具体处理*/
public class Test {
    public static void main(String[] args) {
      //左边为target
        ClassExtends.Print p = new ClassExtends.PrintBanner("电流");
        p.printWeak();
        p.printStrong();

        ObjectDelegate.Print p2 = new ObjectDelegate.PrintBanner("电流");
        p.printWeak();
        p.printStrong();
    }
}
