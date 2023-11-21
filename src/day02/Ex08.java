package day02;
public class Ex08 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        for(int i=0;i<6;i=i+1) {
            lotto[i] = (int) (Math.random() * 6 + 1);
            for(int j=0;j<i;j=j+1){
                if (lotto[i]==lotto[j]){
                    i=i-1;
                    break;
                }
            }
        }
        System.out.println("인생 역전 로또 당첨번호는!!  "+"★ "+lotto[0]+" "+lotto[1]+" "+lotto[2]+" "+
                lotto[3]+" "+lotto[4]+" "+lotto[5]+" ★"+"  축하합니다!!");
    }
}