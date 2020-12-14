package behavior.decorator.decorated;

import behavior.decorator.core.Beverage;

/**
 * @Desc 综合咖啡，被装饰的对象
 * @Date 2020/12/13 12:43
 * @Author AD
 */
public class HouseBlend extends Beverage {
    
    public HouseBlend() {
        this.description = "House Blend Coffee";
    }
    
    @Override
    public double cost() {
        return 0.89;
    }
    
}
