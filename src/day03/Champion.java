package day03;
public class Champion {
    String name;
    Integer damage;
    Integer range;
    Integer healthPoint;
    Integer defense;
    Integer level;
    Integer xp;
    Integer x;
    Integer y;
    String [] itemList;

    //이동
    void move (Integer x, Integer y){
        this.x=x;
        this.y=y;
    }
    //아이템 구매
    String[] shopping(String item){
        for (int i=0; i<this.itemList.length;i=i+1){
            if(this.itemList[i] == "빈칸") {
                this.itemList[i] = item;
                break;
            }
        }
        return itemList;
    }
    //귀환
    void recall (){
        x=0;
        y=0;
    }
    //죽음
    void die (){
        this.recall();
        healthPoint=500;
        System.out.println("챔피언이 죽었습니다.");
        System.out.println("챔피언이 부활합니다.");
    }
    //공격
    Integer attacked (Integer damage){
        this.healthPoint = this.healthPoint - damage;
        if(healthPoint<0){
            this.die();
        }
        return healthPoint;
    }
    void attackTo(Champion target) {
        target.attacked(this.damage);
    }

    //레벨업
    Integer levelup(){
        level= level + 1;
        damage= damage * (110/100);
        defense= defense * (105/100);
        healthPoint= healthPoint * (120/100);
        return level;
    }
    //경험치
    Integer expUp(String enemy){
        if(enemy=="미니언"){
            xp=xp+10;
        }
        else if (enemy=="용") {
            xp=xp+50;
        }
        else if (enemy =="타워") {
            xp=xp+100;
        }
        if(xp>=100){
            this.levelup();
            xp= xp%100;
        }
        return level;
    }
}