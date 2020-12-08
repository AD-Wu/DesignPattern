package behavior.command;

import behavior.command.factory.LightOffCommand;
import behavior.command.factory.LightOnCommand;
import behavior.command.invoker.RemoteController;
import behavior.command.receiver.Light;

/**
 * @Desc
 * @Date 2020/12/8 20:01
 * @Author AD
 */
public class CommandApp {
    
    public static void main(String[] args) {
        RemoteController rc = new RemoteController();
        Light light = new Light();
        LightOffCommand offCommand = new LightOffCommand(light);
        LightOnCommand onCommand = new LightOnCommand(light);
        rc.setCommand(onCommand);
        rc.onButtonWasPushed();
    }
}
