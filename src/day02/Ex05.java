package day02;
public class Ex05 {
    public static void main(String[] args) {
        //정수를 10개 저장하는 배열을 만들고
        int [] array = new int [10];
        //1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하고 배열에 든 숫자들과 총합을 출력
        int sum;
        sum = 0;
        for(int i=0;i<10;i=i+1){
            array[i]= (int)(Math.random()*10+1);
            {
                sum = sum + array[i];
            }
            System.out.println(array[i]);
        }
        System.out.println(sum);


    }
}