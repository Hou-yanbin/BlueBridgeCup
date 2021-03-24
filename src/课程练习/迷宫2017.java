package 课程练习;

import java.util.Arrays;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/24/20:47
 * @Description:
 **/
/*
题目描述
X星球的一处迷宫游乐场建在某个小山坡上。它是由10x10相互连通的小房间组成的。
房间的地板上写着一个很大的字母。我们假设玩家是面朝上坡的方向站立，则：
L表示走到左边的房间，R表示走到右边的房间，U表示走到上坡方向的房间，D表示走到下坡方向的房间。
X星球的居民有点懒，不愿意费力思考。他们更喜欢玩运气类的游戏。这个游戏也是如此！
开始的时候，直升机把100名玩家放入一个个小房间内。玩家一定要按照地上的字母移动。
迷宫地图如下：
------------
UDDLUULRUL
UURLLLRRRU
RRUURLDLRD
RUDDDDUUUU
URUDLLRRUU
DURLRLDLRL
ULLURLLRDU
RDLULLRDDD
UUDDUDUDLL
ULRDLUURRR
------------
请你计算一下，最后，有多少玩家会走出迷宫? 而不是在里边兜圈子。
输出
输出一个整数表示答案
 */
public class 迷宫2017 {
    static String s[]={//定义string字符串用来存储房间
            "UDDLUULRUL",
            "UURLLLRRRU",
            "RRUURLDLRD",
            "RUDDDDUUUU",
            "URUDLLRRUU",
            "DURLRLDLRL",
            "ULLURLLRDU",
            "RDLULLRDDD",
            "UUDDUDUDLL",
            "ULRDLUURRR",

    };
    static char c[][]=new char[10][10];//
    static boolean ans[][]=new boolean[10][10];
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            c[i] = s[i].toCharArray();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(c[i]));//将字符串数组变成字符数组
               

        }
    }
}