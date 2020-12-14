package behavior.decorator.decorated;

import behavior.decorator.core.Beverage;

/**
 * @Desc 浓缩咖啡类，被装饰的对象
 * @Date 2020/12/13 12:37
 * @Author AD
 */
public class Espresso extends Beverage {
    
    public Espresso() {
        this.description = "Espresso";
    }
    
    @Override
    public double cost() {
        return 1.99;
    }
    
}
