package day03;
public class ingame {
    public static void main(String[] args) {
        Champion jinx;
        jinx = new Champion ();
        jinx.name = "징크스";
        jinx.level = 1;
        jinx.damage = 75;
        jinx.range = 500;
        jinx.defense = 50;
        jinx.xp = 0;
        jinx.healthPoint=500;
        jinx.maxHealth=500;
        jinx.x=0;
        jinx.y=0;
        jinx.itemList= new String[6];
        for (int i=0; i<jinx.itemList.length;i=i+1){
            jinx.itemList[i]="빈칸";
        }

        Champion darius;
        darius = new Champion ();
        darius.name = "다리우스";
        darius.level = 1;
        darius.damage = 64;
        darius.range = 164;
        darius.defense = 60;
        darius.xp = 0;
        darius.healthPoint=600;
        darius.maxHealth=600;
        darius.x=0;
        darius.y=0;
        darius.itemList= new String[6];
        for (int i=0; i<darius.itemList.length;i=i+1){
            darius.itemList[i]="빈칸";
        }

        //다리우스가 징크스를 공격한다
        //현재 징크스의 체력을 출력
        jinx.attackTo(darius);
        System.out.println("다리우스의 남은 체력 : "+darius.healthPoint+"/"+darius.maxHealth);
        jinx.attackTo(darius);
        System.out.println("다리우스의 남은 체력 : "+darius.healthPoint+"/"+darius.maxHealth);
        jinx.attackTo(darius);
        System.out.println("다리우스의 남은 체력 : "+darius.healthPoint+"/"+darius.maxHealth);
        jinx.attackTo(darius);
        System.out.println("다리우스의 남은 체력 : "+darius.healthPoint+"/"+darius.maxHealth);
        jinx.attackTo(darius);
        System.out.println("다리우스의 남은 체력 : "+darius.healthPoint+"/"+darius.maxHealth);
        jinx.attackTo(darius);
        System.out.println("다리우스의 남은 체력 : "+darius.healthPoint+"/"+darius.maxHealth);
        jinx.attackTo(darius);
        System.out.println("다리우스의 남은 체력 : "+darius.healthPoint+"/"+darius.maxHealth);












    }


}