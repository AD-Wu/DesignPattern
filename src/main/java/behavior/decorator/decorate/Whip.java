package behavior.decorator.decorate;

import behavior.decorator.core.Beverage;
import behavior.decorator.decorate.core.CondimentDecorator;

/**
 * @Desc
 * @Date 2020/12/13 12:53
 * @Author AD
 */
public final class Whip extends CondimentDecorator {
    
    private final Beverage beverage;
    
    public Whip(Beverage beverage) {this.beverage = beverage;}
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    
    @Override
    public double cost() {
        return beverage.cost() + 0.8;
    }
    
}
