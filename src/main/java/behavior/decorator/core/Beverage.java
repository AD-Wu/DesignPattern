package behavior.decorator.core;

/**
 * @Desc 饮料超类
 * @Date 2020/12/13 12:16
 * @Author AD
 */
public abstract class Beverage {
    
    protected String description = "Unknown Beverage";
    
    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
    
}
