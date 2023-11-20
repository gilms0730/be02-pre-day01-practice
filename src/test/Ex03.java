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

        int n=5;
        for (int g = 0; g < n; g = g + 1){
            for (int m = 0; m < n-g-1; m = m + 1)
            {System.out.printf(" ");}
            for (int s = 0; s < 2*g+1; s = s + 1)
            {System.out.printf("*");}
            System.out.println();
        }

    }
}
