package entity;

public class RateDiscountPolicy extends DiscountPolicy{

    double 할인률;

    public RateDiscountPolicy(double 할인률) {
        this.할인률 = 할인률;
    }

    @Override
    public int discount(int 원가격) {
        return (int)(원가격 * (1 - 할인률));
    }
}
