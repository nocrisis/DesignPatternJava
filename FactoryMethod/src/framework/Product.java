package framework;

/*framework.Product，属于框架*/
public abstract class Product {
    public abstract void use();
   /* 构造函数不能被继承，abstract必须实现，因此abstract构造方法毫无意义
   应该另外声明一个public abstract setProductName(String name);的专有方法
   public abstract Product(String name);*/
}
