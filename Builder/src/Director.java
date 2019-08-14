/*Director监工，使用 Builder的接口来生成实例*/
public class Director {
    private Builder builder;
/*不依赖于具体建造者，不知道具体使用哪个类来建造
* 只有不知道子类才能替换
* 时刻可替换具体的建造者*/
    public Director(Builder builder) {
        this.builder = builder;
    }


    public void construct() {
        builder.makeTitle(" Greeting");
        builder.makeString(" 从早上到下午");
        builder.makeItems(new String[]{
                "早上好。",
                "下午好。"
        });
        builder.makeItems(new String[]{
                "晚上好。",
                "晚安。",
                "再见。"
        });
        builder.close();

    }

}
