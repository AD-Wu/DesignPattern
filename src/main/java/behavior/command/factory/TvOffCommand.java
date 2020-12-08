package behavior.command.factory;

import behavior.command.core.ICommand;
import behavior.command.receiver.TV;

/**
 * @Desc 关闭电视命令
 * @Date 2020/12/8 19:44
 * @Author AD
 */
public class TvOffCommand implements ICommand {
    
    private final TV tv;
    
    public TvOffCommand(TV tv) {this.tv = tv;}
    
    public void execute() {
        tv.off();
    }
    
}
