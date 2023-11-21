package day02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // 입력 받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);
        //숫자를 입력받을 크기가 10인 배열 만들기
        int [] array = new int [10];
        //0~9 까지 반복
        // 배열의 횟수번째에 숫자를 받아서 저장
        for (int i=0;i<10;i=i+1){
            System.out.print("숫자 입력해라 : ");
            array[i] = sc.nextInt();}
        //모든수를 저장할 변수에 반복횟수에 해당하는 배열의 값을 더해서 저장
        Integer every;
        every=0;
        for (int i=0;i<10;i=i+1){every= every+array[i];}
        //모든 수를 저장한 변수에 배열의 크기만큼 나눠서 출력
        System.out.println(every / 10);
    }
}