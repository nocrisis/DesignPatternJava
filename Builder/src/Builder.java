/*Builder定义接口，准备了用于生成实例的方法*/
public interface Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String string);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
