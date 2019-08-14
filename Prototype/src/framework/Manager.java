package framework;

import java.util.HashMap;
/*client使用者
* 负责使用 复制现有instanxe并生成新实例的方法*/
public class Manager {
    private HashMap showCase = new HashMap();

    public void register(String name, Product proto) {
        showCase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = (Product) showCase.get(protoName);
        return p.createClone();
    }
}
