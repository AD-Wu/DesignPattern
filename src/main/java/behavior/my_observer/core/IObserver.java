package behavior.my_observer.core;

/**
 * @Desc TODO
 * @Date 2020/12/10 23:24
 * @Author AD
 */
public interface IObserver<T> {
    
    void update(T t);
}
