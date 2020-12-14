package behavior.my_observer;

import behavior.my_observer.factory.Server;
import behavior.my_observer.factory.ServerListener;

/**
 * @Desc TODO
 * @Date 2020/12/10 23:28
 * @Author AD
 */
public class Test {
    
    public static void main(String[] args) {
        Server server = new Server();
        ServerListener listener = new ServerListener(server);
        server.setSomething("服务器收到消息");
    }
}
