package behavior.my_observer.core;

/**
 * @Desc TODO
 * @Date 2020/12/10 23:23
 * @Author AD
 */
public interface ISubject {
    
    void addObserver(IObserver observer);
    
    void deleteObserver(IObserver observer);
    
    void notifyAllObserver();
    
}
