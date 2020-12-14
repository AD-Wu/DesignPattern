package behavior.jdk_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Desc TODO
 * @Date 2020/12/10 22:45
 * @Author AD
 */
public class Reader implements Observer {
    
    private final Observable observable;
    
    public Reader(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    public void update(Observable o, Object arg) {
        if (o instanceof NewsPaper) {
            NewsPaper newsPaper = (NewsPaper) o;
            // 从被观察对象处主动拉取更新
            String news = newsPaper.getNews();
            System.out.println("获得新闻：" + news);
        }
    }
    
}
