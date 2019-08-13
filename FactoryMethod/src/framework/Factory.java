package framework;

/*Creator，属于框架*/
//framework不依赖于concreateProcess
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
//不用new生成实例，而调用生成实例的子类专用方法来生成，可以防止父类与其他具体子类耦合
    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
