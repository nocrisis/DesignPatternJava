package ObjectDelegate;

/*adapter适配，满足Target方法
 * （类适配器通过继承使用adptee）
 * 对象适配器通过委托使用adptee，继承父类，父类为target
 * new 出被适配类对象做成员变量
 * */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
