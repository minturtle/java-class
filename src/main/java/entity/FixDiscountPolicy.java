package entity;

public class FixDiscountPolicy extends DiscountPolicy{

    private int 할인금액;

    public FixDiscountPolicy(int 할인금액) {
        this.할인금액 = 할인금액;
    }

    @Override
    public int discount(int 원가격) {
        return 원가격 - 할인금액;
    }
}
