package test;

public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        // 아니면
        for (Integer a= 0; a<5; a= a + 1){
            for (Integer b=0; b<5; b= b +1){
                System.out.printf("*");
            }
            System.out.println();
        }


        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        //아니면

        for (Integer a= 0; a<5; a= a + 1) {
            for (Integer b = -1; b < a; b = b + 1) {
                System.out.printf("*");
            }
            System.out.println();
        }

        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
         *///공백이 414
        System.out.println(" ");
        System.out.println("               ◐");
        System.out.println(" ");
        System.out.println("★~~★~~~★ ");
        System.out.println("~~★~~~★~~ ");

        System.out.println("    ★");
        for (Integer i=0;i<5;i=i+1){
            for (Integer j=0;j<5-i-1;j=j+1){
                System.out.printf(" ");}
            for (Integer p=0;p<2*i+1;p=p+1){
                System.out.printf("A");}
            System.out.println();}
        for (Integer i=0;i<3;i=i+1){
            for (Integer j=0;j<3;j=j+1){
                System.out.printf(" ");}
            for (Integer p=0;p<3;p=p+1){
                System.out.printf("w");}
            System.out.println();}
        System.out.println("ㅛㅛㅛㅛㅛㅛ");
        System.out.println("MARRY CHRISMAS");
    }
}
