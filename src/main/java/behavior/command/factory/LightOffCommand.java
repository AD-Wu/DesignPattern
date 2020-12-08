package behavior.command.factory;

import behavior.command.core.ICommand;
import behavior.command.receiver.Light;

/**
 * @Desc 关灯命令
 * @Date 2020/12/8 19:42
 * @Author AD
 */
public class LightOffCommand implements ICommand {
    
    /**
     * 灯对象，即接收者。命令里包含实际灯接收者，即动作的实际执行对象
     */
    private final Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.off();
    }
    
}
