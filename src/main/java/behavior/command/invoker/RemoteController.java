package behavior.command.invoker;

import behavior.command.core.ICommand;

/**
 * @Desc 遥控器类，即调用者
 * @Date 2020/12/8 19:55
 * @Author AD
 */
public class RemoteController {
 
    private ICommand command;
    
    public void setCommand(ICommand command){
        this.command = command;
    }
    
    public void onButtonWasPushed(){
        command.execute();
    }
}
