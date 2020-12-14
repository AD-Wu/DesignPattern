package behavior.decorator;

import behavior.decorator.core.Beverage;
import behavior.decorator.decorate.Mocha;
import behavior.decorator.decorate.Soy;
import behavior.decorator.decorate.Whip;
import behavior.decorator.decorated.DarkRoast;
import behavior.decorator.decorated.Espresso;
import behavior.decorator.decorated.HouseBlend;

/**
 * @Desc 星巴克咖啡
 * @Date 2020/12/13 13:30
 * @Author AD
 */
public class StarbuzzCoffee {
    
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());
        
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        
        Beverage b = new HouseBlend();
        b = new Soy(b);
        b = new Mocha(b);
        b = new Whip(b);
        System.out.println(b.getDescription() + " $" + b.cost());
    }
    
}
