package concreteProcess;

import framework.Product;

/*ConcreteProduct，属于具体加工*/
public class IDCard extends Product {
    private String owner;

    private int Id;

    //只让自己和子类修改,强迫外部必须通过IDCardFactory类来生成实例
    //new IDCard(“xming”)报错
    IDCard(String owner, int id) {
        this.owner = owner;
        this.Id = id;
        System.out.println("制作" + owner + "的卡号为" + Id + "的ID卡");
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的卡号为" + Id + "的ID卡");

    }

    public String getOwner() { return owner; }

    public int getId() { return Id; }

}
