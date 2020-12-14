package behavior.jdk_observer;

import java.time.LocalDateTime;
import java.util.Observable;

/**
 * @Desc TODO
 * @Date 2020/12/10 22:44
 * @Author AD
 */
public class NewsPaper extends Observable {
    
    private String news;
    
    public void setNews(String news) {
        this.news = news;
        setChanged();
        // 没有参数，表示通知方式使用"拉"模式。建议使用有参数的"推"模式，推被认为才是正确的
        notifyObservers();
    }
    
    /**
     * 对外暴露拉取更新的接口
     *
     * @return
     */
    public String getNews() {
        return "The news is:" + news + ", now time is:" + LocalDateTime.now().toString();
    }
    
}
