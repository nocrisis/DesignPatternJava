/*迭代器*/
public interface Iterator {
    public abstract boolean hasNext();
//返回当前元素，并指向下一个
    public abstract Object next();
}
