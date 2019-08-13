package ClassExtends;



/*adapter适配，满足Target方法
* 类适配器通过继承使用adptee，继承父类，父类为被适配类,实现接口为target
* （对象适配器通过委托使用adptee）
* */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        //构造函数生成banner类的实例
        super(string);
    }

    //print类在调用的时候，实际上是通过继承调用父类方法委托给了banner类的实例处理
    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
