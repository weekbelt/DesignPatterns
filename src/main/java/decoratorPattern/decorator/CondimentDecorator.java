package decoratorPattern.decorator;

import decoratorPattern.component.Beverage;

public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
