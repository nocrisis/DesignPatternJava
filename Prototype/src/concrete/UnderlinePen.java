package concrete;

import framework.Product;
/*concrete prototype具体的原型
 * 负责实现 复制现有instance并生成新实例的方法*/
public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.print("\"" + s + "\"");
        System.out.println("");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
//java赋值是复制对象引用，如果我们想要得到一个对象的副本，使用赋值操作是无法达到目的的
//Object对象有个clone()方法，实现了对象中各个属性的复制，但它的可见范围是protected的，所以实体类使用克隆的前提是：
//① 实现Cloneable接口，这是一个标记接口，自身没有方法。
//② 覆盖clone()方法，可见性提升为public。
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
