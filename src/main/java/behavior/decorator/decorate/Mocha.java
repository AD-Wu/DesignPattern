package behavior.decorator.decorate;

import behavior.decorator.core.Beverage;
import behavior.decorator.decorate.core.CondimentDecorator;

/**
 * @Desc 摩卡调料，装饰者
 * @Date 2020/12/13 12:46
 * @Author AD
 */
public final class Mocha extends CondimentDecorator {
    
    private final Beverage beverage;
    
    public Mocha(Beverage beverage) {this.beverage = beverage;}
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    
    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
    
}
