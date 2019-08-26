import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

/*Client 委托者
* 调用AbstractFactory角色和AbstractProduct角色
* 的Api接口来进行工作，对具体的零件、产品、工厂一无所知
* 易于增加新的工厂，无须修改AF和Client，难以增加新的零件*/
public class AFTest {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link people=factory.createLink("人民日报","http://www.people.com.cn/");
        Link gmw=factory.createLink("光明日报","http://www.gmw.cn/");
        Link us_yahoo = factory.createLink("YAhoo!", "http:www.yahoo.com");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link baidu = factory.createLink("Baidu", "http://www.baidu.com/");
        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahho = factory.createTray("Yahoo!");
        trayYahho.add(us_yahoo);
        trayYahho.add(jp_yahoo);

        Tray traySearch = factory.createTray("搜索引擎");
        traySearch.add(trayYahho);
        traySearch.add(excite);
        traySearch.add(baidu);

        Page page=factory.createPage("LinkPage","JK.Rollin");
        page.add(trayNews);
        page.add(traySearch);
        page.output();

        /*Factory factory1 = Factory.getFactory(args[0]);
        Page page1 = factory1.createYaHooPage();
        page1.output();*/
    }

    public static void usage() {
        System.out.println("Usage:Java AFTest class.name.of.ConcreteFactory");
        System.out.println("Usage:Java AFTest listfactory.ListFactory");
        System.out.println("Usage:Java AFTest tablefactory.TableFactory");
    }
}
