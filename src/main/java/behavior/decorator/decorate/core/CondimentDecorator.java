package behavior.decorator.decorate.core;

import behavior.decorator.core.Beverage;

/**
 * @Desc 调料装饰者类
 * @Date 2020/12/13 12:29
 * @Author AD
 */
public abstract class CondimentDecorator extends Beverage {
    
    /**
     * 所有调料装饰者都必须重新实现getDescription()方法
     * @return
     */
    public abstract String getDescription();
}

