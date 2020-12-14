package behavior.decorator.decorated;

import behavior.decorator.core.Beverage;

/**
 * @Desc TODO
 * @Date 2020/12/13 13:31
 * @Author AD
 */
public class DarkRoast extends Beverage {
    
    public DarkRoast() {
        this.description = "DarkRoast";
    }
    
    @Override
    public double cost() {
        return 1.25;
    }
    
}
