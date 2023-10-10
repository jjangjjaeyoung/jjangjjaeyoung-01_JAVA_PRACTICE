package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */
        Calculator ca = new Calculator();
       ca.checkMethod();

       int a = 10;
       int b = 20;
        String result = ca.sumTwoNumber(a,b);
        System.out.println(result);

        String result2 = ca.multiTwoNumber(a, b);
        System.out.println(result2);

//        int multiTwoNumber2
//
    }

}
