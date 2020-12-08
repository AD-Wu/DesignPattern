package behavior.command.receiver;

/**
 * @Desc 电视对象，接收者之一，即实际的动作执行者
 * @Date 2020/12/8 19:49
 * @Author AD
 */
public class TV {
    
    public void on() {
        System.out.println("打开电视");
    }
    
    public void off() {
        System.out.println("关闭电视");
    }
    
}
