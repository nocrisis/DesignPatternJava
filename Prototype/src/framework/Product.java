package framework;
/*prototype原型
* 负责定义 复制现有instanxe并生成新实例的方法*/
public interface Product extends Cloneable {
    public abstract void use(String s);

    public abstract Product createClone();
}
