package day02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        //정수로 된 돈의 액수를 입력받아
        Scanner sc = new Scanner(System.in);
        Integer [] unit = {50000,10000,1000,500,100,50,10,1};

        //오만원권, 만원권, 천원권, 500원권, 100원권, 50원권, 10원권, 1원권이
        // 각자 몇개로 변환되는지 출력
        System.out.print("*환전기*돈을 넣으시오 : ");
        int money = sc.nextInt();
        System.out.println("투입 금액"+ ":" + money+"원");

        for (int i=0;i<8;i=i+1){
            int exchange = money/unit[i];
            money %= unit[i];
            System.out.println(unit[i]+"원권"+" "+exchange+"장");
        }


        //unit 배열을 활용

    }
}