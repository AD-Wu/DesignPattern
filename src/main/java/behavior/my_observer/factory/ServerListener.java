package behavior.my_observer.factory;

import behavior.my_observer.core.Event;
import behavior.my_observer.core.IObserver;
import behavior.my_observer.core.ISubject;

/**
 * @Desc TODO
 * @Date 2020/12/10 23:49
 * @Author AD
 */
public class ServerListener implements IObserver<Event> {
    
    private final ISubject subject;
    
    public ServerListener(ISubject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }
    
    @Override
    public void update(Event event) {
        System.out.println("收到事件：" + event);
    }
    
}
