import java.io.InputStream;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    //因为有非抽象方法，所以不能用接口代替非抽象类
//父类的模板方法中编写了算法，一次无须在每个子类中再编写算法
    //声明为final防止子类更改
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
