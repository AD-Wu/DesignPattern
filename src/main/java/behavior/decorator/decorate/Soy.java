package behavior.decorator.decorate;

import behavior.decorator.core.Beverage;
import behavior.decorator.decorate.core.CondimentDecorator;

/**
 * @Desc 豆浆调料，装饰者
 * @Date 2020/12/13 12:51
 * @Author AD
 */
public final class Soy extends CondimentDecorator {
    
    private final Beverage beverage;
    
    public Soy(Beverage beverage) {this.beverage = beverage;}
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    
    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
    
}
