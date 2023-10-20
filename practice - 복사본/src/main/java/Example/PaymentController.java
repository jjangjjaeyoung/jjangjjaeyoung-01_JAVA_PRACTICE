package Example;

import java.util.Scanner;

public class PaymentController {

    Scanner sc=new Scanner(System.in);

    public void checkCoupon() {
        System.out.println("쿠폰이 1장 있습니다. 사용하시겠습니까? (사용 : Y(y)) ");
        String check=sc.nextLine();
        if(check.equalsIgnoreCase("y")) {
            ResultBill.total_money*=0.9;
            checkPoint();
        }
        else {
            System.out.println("쿠폰을 사용하지 않습니다. 적립금을 확인합니다.");
            checkPoint();
        }
    }

    public void checkPoint() {
        System.out.println("현재 적립금은 "+ResultBill.point_money+"원 입니다. 사용하시겠습니까? (사용 : Y(y)) ");
        String check=sc.nextLine();
        if(check.equalsIgnoreCase("y")) {
            System.out.print("사용할 적립금을 입력해주세요 : ");
            int point=sc.nextInt();
            ResultBill.total_money-=point;
            ResultBill.point_money-=point;
            System.out.println("사용할 적립금은 "+point+"원 입니다.");
        }
        else {
            System.out.println("적립금을 사용하지 않습니다. 결제창으로 넘어갑니다.");
        }
    }

    public void buy(int money) {
        if(money>=50000) {
            ResultBill.point_money+=money*0.01;
        }
        checkCoupon();
    }

    public void resultItem(String[] item,int money) {
        System.out.println("구매할 제품은 "+item+"이고, 가격은 "+money+"원 입니다.");
        buy(money);
    }

public void buyShoesName(String name){
    ResultBill.shoesName.add(name);
}

public void buyShoesSize(String size){
        ResultBill.shoesSize.add(size);
}
public void buyShoesPrice(int price){
        ResultBill.price.add(price);
}

public void print(){
    System.out.println("현재까지 구매하신 ");
    for (int i =0; i < ResultBill.shoesName.size(); i++){
        System.out.print(ResultBill.shoesName.get(i)+" ");
        System.out.print(ResultBill.shoesSize.get(i) +" ");
        System.out.print(ResultBill.price.get(i) +" ");

    }

}

}
