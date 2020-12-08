package behavior.command.factory;

import behavior.command.core.ICommand;
import behavior.command.receiver.TV;

/**
 * @Desc 打开电视命令
 * @Date 2020/12/8 19:43
 * @Author AD
 */
public class TvOnCommand implements ICommand {
    
    private final TV tv;
    
    public TvOnCommand(TV tv) {this.tv = tv;}
    
    public void execute() {
        tv.on();
    }
    
}
