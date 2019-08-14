/*Client使用者（builder模式不包括该角色），使用了Builder模式*/
public class Test {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            /*main没有调用Builder类，只是调用了Direct类的construct方法
            * 复杂组装过程隐藏在Director中*/
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + " doc has finished write.");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage:Java Test plain : write pure text document");
        System.out.println("Usage:Java Test html : write HTML document");
    }
}
