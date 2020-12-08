package behavior.command.receiver;

/**
 * @Desc 灯类对象。接收者之一，实际的动作执行者
 * @Date 2020/12/8 19:49
 * @Author AD
 */
public class Light {
    
    public void on() {
        System.out.println("开灯");
    }
    
    public void off() {
        System.out.println("关灯");
    }
    
}
