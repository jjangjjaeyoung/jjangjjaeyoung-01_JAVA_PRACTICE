package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 국어, 영어, 수학 점수를 입력받아
         * 평균 점수가 60점 이상이면서 각 과목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
         * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해주어야 합니다.
         * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다." 라고 출력하고,
         * 과목당 과락 점수가 있는 경우 "xx 과목의 점수 미달로 불합격 입니다." 출력하세요
         *
         * -- 입력 예시 --
         * 국어 점수를 입력하세요 : 60
         * 영어 점수를 입력하세요 : 30
         * 수학 점수를 입력하세요 : 20
         *
         * -- 출력 예시 --
         * 평균 점수 미달로 불합격입니다.
         * 영어 점수 미달로 불합격입니다.
         * 수학 점수 미달로 불합격입니다.
         * */
        Scanner sc = new Scanner(System.in);


        System.out.print("국어 점수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int c = sc.nextInt();

        int result1 = (a + b+ c)/3 ;
        if (result1 > 59 && 40<=a && 40<=b && 40<=c){
            System.out.println("합격입니다.");

        }else{
            System.out.println("평균점수 미달로 불합격입니다.");
        }if (a<40){
            System.out.println("국어점수 미달로 불합격입니다.");
        }if (b < 40){
            System.out.println("영어점수 미달로 불합격입니다.");
        }if (c < 40){
            System.out.println("수학점수 미달로 불합격입니다.");
        }

        }
    }

