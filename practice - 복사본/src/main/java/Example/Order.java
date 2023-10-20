package Example;

public class Order {
    private boolean coupon;
    private int point;
    private int money;

    public Order() {
    }

    public Order(boolean coupon, int point, int money) {
        this.coupon = coupon;
        this.point = point;
        this.money = money;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public int getPoint() {
        return point;
    }

    public int getMoney() {
        return money;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "사용하시는 쿠폰은 회원가입 축하 쿠폰이며, 적립금은 "+this.point+"원 입니다.";
    }
}
