package 课后习题.Step1API学习;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/19/17:34
 * @Description:
 **/
/*
题目描述
小明很喜欢猜谜语。最近，他被邀请参加了X星球的猜谜活动。
每位选手开始的时候都被发给777个电子币。
规则是：猜对了，手里的电子币数目翻倍，猜错了，扣除555个电子币, 扣完为止。
小明一共猜了15条谜语。战果为：vxvxvxvxvxvxvvx
其中v表示猜对了，x表示猜错了。请你计算一下，小明最后手里的电子币数目是多少。

输出
请填写表示最后电子币数目的数字。
 */
public class 有奖猜谜2016 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=777;
        while (scanner.hasNext()){
           int n= scanner.nextInt();
            if (n==1){
                num+=num;
            }
            if (n==0){
                num-=555;
            }
            System.out.println(num);//vxvxvxvxvxvxvvx//结果：58497
        }
        System.out.println("58497");


    }

}

