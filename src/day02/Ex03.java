package day02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // 입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);
        // 숫자를 입력받을 크기가 6인 배열 만들기
        int[] unit;
        unit = new int[6];
        //0부터 5까지 반복
        for (int i = 0; i < 6; i = i + 1) {
            System.out.print("숫자 입력해라 : ");
            unit[i] = sc.nextInt();
        }
        // 배열의 반복횟수 번째에 숫자를 입력 받아서 저장
        //5부터 0까지 반복
        for (int i = 5; i >= 0; i = i - 1) {
            System.out.println(unit[i]);
        }
        // 배열의 반복 횟수 번째에 숫자를 출력
    }
}