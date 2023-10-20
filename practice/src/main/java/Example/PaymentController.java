package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentController {

    static int total_money;
    static int point_money;


    Scanner sc=new Scanner(System.in);

    public void checkCoupon() {
        System.out.print("쿠폰이 1장 있습니다. 사용하시겠습니까? (사용 : Y(y)) ");
        String check=sc.nextLine();
        sc.nextLine();
        if(check.equalsIgnoreCase("y")) {
           total_money*=0.9;
            checkPoint()
        }
        else {
            System.out.println("쿠폰을 사용하지 않습니다. 적립금을 확인합니다.");
            checkPoint();
        }
    }

    public void checkPoint(int price) {
        System.out.println("현재 적립금은 "+point_money+"원 입니다. 사용하시겠습니까? (사용 : Y(y)) ");
        String check=sc.nextLine();
        if(check.equalsIgnoreCase("y")) {
            System.out.print("사용할 적립금을 입력해주세요 : ");
            int point=sc.nextInt();
            total_money-=point;
            point_money-=point;
            System.out.println("사용할 적립금은 "+point+"원 입니다.");
            System.out.println("결제창으로 넘어갑니다");

        }
        else {
            System.out.println("적립금을 사용하지 않습니다. 결제창으로 넘어갑니다.");
        }
    }

    public void buy(int money) {
        if(money>=50000) {
            point_money+=money*0.01;
        }
        checkCoupon();
    }

    public void resultItem(String[] item,int money) {
        System.out.println("구매할 제품은 "+item+"이고, 가격은 "+money+"원 입니다.");
        buy(money);
    }



public void print(ArrayList<productDTO>dto ,int price){
    System.out.println("===결제===");
    System.out.println("1.바로 결제\n2.쿠폰 및 적립금 적용\n선택해주세요.");
    int num =sc.nextInt();
    if(num==1){
        System.out.println("현재까지 구매하신 상품은");
        for (int i = 0; i < dto.size(); i++){
            System.out.println(dto.get(i) + "입니다.");

        }
        System.out.println("축 구매");
    }else {
        buy(price);
    }

    }

}


