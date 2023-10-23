package com.teamproject.hamster.controller;



import com.teamproject.hamster.dto.ProductDTO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PaymentController {
    public static int total_money;
    public static int sum=0;
    private ArrayList<ProductDTO> payments = null;

    Scanner sc=new Scanner(System.in);

    public void checkCoupon() {

            System.out.print("회원가입 쿠폰이 있습니다. 사용하시겠습니까? (사용 : Y(y)) ");
            String check = sc.nextLine();
            sc.nextLine();
            if (check.equalsIgnoreCase("y")) {
                total_money *= 0.9;
            } else {
                System.out.println("쿠폰을 사용하지 않습니다. 결제창으로 넘어갑니다.");
                print(payments,total_money);

            }


    }
    //어레이리스트에 신발 두개 이상 구매시 쿠폰과 적립금이 적용된 인트형 가격을 2번째 인덱스에 어떻게 넣는지
    // 여러개 구매시 어레이 리스트에 계속 쌓이는지, 한켤레 구매시마다 초기화가 되고 다시 값이 들어가는지

//    public void checkPoint() {
//
//            System.out.println("현재 적립금은 " + point_money + "원 입니다. 사용하시겠습니까? (사용 : Y(y)) ");
//            String check = sc.nextLine();
//            if (check.equalsIgnoreCase("y")) {
//                System.out.print("사용할 적립금을 입력해주세요 : ");
//                int point = sc.nextInt();
//                if (point > point_money) {
//                    System.out.println(point_money + "보다 작은 금액을 입력해주세요.");
//                } else {
//                    total_money -= point;
//                    point_money -= point;
//                    System.out.println("사용할 적립금은 " + point + "원 입니다.");
//                    System.out.println("결제창으로 넘어갑니다.");
//
//
//                }
//
//            } else {
//                System.out.println("적립금을 사용하지 않습니다. 결제창으로 넘어갑니다.");
//               // print(paymenets,total_money);
//
//
//            }








    public void print(ArrayList<ProductDTO> product){
        // 결제목록의 정보를 다 받아서 현재 클래스에서만 사용할 필드에 값을 추가
        payments = product;
        for(int i=0;i<product.size();i++) {
            total_money+=product.get(i).getPrice();
        }
        System.out.println("=====결제하기=====");
        System.out.print("1. 바로 결제\n2.쿠폰 적용\n선택해주세요.");
        int num=sc.nextInt();
        if(num==1) {
            System.out.println("현재까지 구매하신 제품은 ");
            for (int i =0; i < product.size(); i++){
                System.out.println(product.get(i).getName() + product.get(i).getSize() + "입니다.");

            }

            System.out.println("총 구매 금액은 : "+total_money);
            System.out.println("축!구매에 성공하셨습니다.");
        }
        else {
            System.out.println("쿠폰 적용으로 넘어갑니다.");
            checkCoupon();
        }



    }

    public void print(ArrayList<ProductDTO> product,int total_money) {
        System.out.println("현재까지 구매하신 제품은 ");
        for (int i =0; i < product.size(); i++){
            System.out.println(product.get(i).getName() + product.get(i).getSize() + "입니다.");

        }

        System.out.println("총 구매 금액은 : "+total_money);
        System.out.println("축!구매에 성공하셨습니다.");
    }





}

