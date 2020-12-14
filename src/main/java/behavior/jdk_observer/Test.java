package behavior.jdk_observer;

/**
 * @Desc TODO
 * @Date 2020/12/10 22:45
 * @Author AD
 */
public class Test {
    
    public static void main(String[] args) {
        NewsPaper newsPaper = new NewsPaper();
        Reader reader = new Reader(newsPaper);
        newsPaper.setNews("今天的第一天新闻");
    }
    
}
