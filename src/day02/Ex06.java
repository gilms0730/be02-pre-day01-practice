package day02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // 배열에 월~일까지 초기화 하고 0부터 6까지의 숫자를 입력받아 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 범위에 없는
        //숫자를 입력 시 잘못 출력했습니다 출력
        Scanner sc = new Scanner(System.in);
        String [] week = new String[7];
        week[0]="Sunday";
        week[1]="Monday";
        week[2]="Tuesday";
        week[3]="Wednesday";
        week[4]="Thursday";
        week[5]="Friday";
        week[6]="Saturday";

        int number=0;
        System.out.print("글자 입력해라 : ");
        number = sc.nextInt();
        if(number >=0 && number<=6){
            System.out.println(week[number]);
        }
        else { System.out.println("잘못입력하셨습니다");}
        }




    }
