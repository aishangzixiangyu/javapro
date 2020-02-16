package com.neudu.test5;

import java.util.*;

public class Langren {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入玩游戏的人数:");
        int player = scanner.nextInt();
        if(player<12 || player>18){
            System.out.println("超出游戏人数限制!!!");
        }else{
            //总牌
            List<String> all = new ArrayList<>();
            //手牌
            List<String> play = new ArrayList<>();
            //底牌
            List<String> di = new ArrayList<>();

            init(all);

            playpai(all,player);

            all.remove("盗贼");
            play.add("盗贼");

            dipai(all,di);
            play.addAll(all);

            Collections.shuffle(play);
            System.out.println("底牌为"+di);
            System.out.println("手牌为"+play);

        }

    }
    //找到最低的总牌人数，然后进行初始化
    public static void init(List<String> list){
        //循环添加4个狼人
        for(int i = 0; i < 4; i++){
            list.add("狼人");
        }
        //循环添加4个村民
        for(int i = 0; i < 4; i++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }
    //根据不同的人数 初始化不同的牌
    public static void playpai(List<String>list,int player){
        if(player > 12)
            list.add("村民");
        if(player > 13)
            list.add("替罪羊");
        if(player > 14)
            list.add("狼人");
        if(player > 15)
            list.add("村民");
        if(player > 16)
            list.add("村民");
        if(player > 17)
            list.add("吹笛者");
    }
    //根据底牌的要求设置底牌
    public static void dipai(List<String> list, List<String> di){
        //初始化不同的底牌
        while(di.size() < 3){
            Random random = new Random();
            int index = random.nextInt(list.size());
            if(di.contains("狼人")&&list.get(index).equals("狼人")){
                continue;
            }else{
                di.add(list.remove(index));
            }
        }
    }
}
