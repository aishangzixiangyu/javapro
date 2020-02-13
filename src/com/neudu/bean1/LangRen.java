package com.neudu.bean1;

import java.util.*;

public class LangRen {

    public static void main(String[] args) {
        //狼人杀
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入游戏人数:");
        int player = scanner.nextInt();
        if(player<12||player>18){
            System.out.println("游戏人数超过限制，出现错误！！！");
        }else{
           /*
           设置三个表
               1 总牌
               2发到玩家的手牌列表
               3底牌

           */
            List<String> all = new ArrayList<>();
            List<String> play = new ArrayList<>();
            List<String> di = new ArrayList<>();
            init(all);
            pai(all,player);
            //因为底牌中没有盗贼，所以把盗贼直接给玩家手牌中
            all.remove("盗贼");
            play.add("盗贼");
            //放入底牌
            dipai(all,di);
            //将放完底牌的总牌，放到玩家的手牌中去
            play.addAll(all);
            //随机打乱牌的顺序
            Collections.shuffle(play);
            System.out.println("手牌为"+play);
            System.out.println("底牌为"+di);
        }
    }
    //初始化游戏牌  12个人开始
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
        list.add("村人");
        list.add("盗贼");
    }
    //根据不同玩该游戏的人数不同，初始化不同的牌
    public static void pai(List<String> list,int player){
        if(player>12)
            list.add("村民");
        if(player>13)
            list.add("替罪羊");
        if(player>14)
            list.add("狼人");
        if(player>15)
            list.add("村民");
        if(player>16)
            list.add("村民");
        if(player>17)
            list.add("狼人");
    }
    //从总牌中随机拿出三张底牌
    public static void dipai(List<String> list,List<String> di){
        while(di.size()<3){
            Random random = new Random();
            int index = random.nextInt(list.size());
            if(di.contains("狼人")&&list.get(index).equals("狼人"))
                continue;
            else
                di.add(list.remove(index));
        }
    }
}
