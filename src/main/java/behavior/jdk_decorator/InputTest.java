package behavior.jdk_decorator;

import java.io.*;

/**
 * @Desc JDK装饰者模式测试
 * @Date 2020/12/14 22:34
 * @Author AD
 */
public class InputTest {
    
    public static void main(String[] args) {
        File file = new File("/Users/sunday/IdeaProjects/DesignPattern/src/main/resources/Decorator.txt");
        try (InputStream in =
                     new LowerCaseInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(file)))) {
            int c;
            while ((c = in.read()) > 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try(PushbackInputStream in = new PushbackInputStream(new BufferedInputStream(new FileInputStream(file)))){
        
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
