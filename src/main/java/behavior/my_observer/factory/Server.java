package behavior.my_observer.factory;

import behavior.my_observer.core.Event;
import behavior.my_observer.core.IObserver;
import behavior.my_observer.core.ISubject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Desc TODO
 * @Date 2020/12/10 23:29
 * @Author AD
 */
public class Server implements ISubject {
    
    private final List<IObserver> observers;
    private Event event;
    
    public Server() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }
    
    @Override
    public void deleteObserver(IObserver observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }
    
    @Override
    public void notifyAllObserver() {
        for (IObserver observer : observers) {
            observer.update(event);
        }
    }
    
    public void setSomething(String content) {
        event = new Event();
        event.setArg(content);
        event.setNotifyTime(LocalDateTime.now());
        notifyAllObserver();
    }
    
}
