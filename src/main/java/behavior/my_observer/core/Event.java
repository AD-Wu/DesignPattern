package behavior.my_observer.core;

import java.time.LocalDateTime;
import java.util.StringJoiner;

/**
 * @Desc TODO
 * @Date 2020/12/10 23:26
 * @Author AD
 */
public class Event {
    
    private Object arg;
    private LocalDateTime notifyTime;
    private Throwable throwable;
    
    public Object getArg() {
        return arg;
    }
    
    public void setArg(Object arg) {
        this.arg = arg;
    }
    
    public LocalDateTime getNotifyTime() {
        return notifyTime;
    }
    
    public void setNotifyTime(LocalDateTime notifyTime) {
        this.notifyTime = notifyTime;
    }
    
    public Throwable getThrowable() {
        return throwable;
    }
    
    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
    
    @Override
    public String toString() {
        return new StringJoiner(", ", Event.class.getSimpleName() + "[", "]")
                .add("arg=" + arg)
                .add("notifyTime=" + notifyTime)
                .add("throwable=" + throwable)
                .toString();
    }
    
}
