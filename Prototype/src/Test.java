import concrete.MessageBox;
import concrete.UnderlinePen;
import framework.Manager;
import framework.Product;
//一旦在代码中出现要使用的类的名字，就无法与该类分开来，也就无法实现复用
//即使没有java文件（有class文件）也能复用该类是关键
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);
//key相当于类名，解耦框架与生成的实例。不用new something()
        Product p1 = manager.create("strong message");
        p1.use("Hello , world .");
        Product p2 = manager.create("warning box");
        p2.use("Hello , world .");
        Product p3 = manager.create("slash box");
        p3.use("Hello , world .");
    }
}
