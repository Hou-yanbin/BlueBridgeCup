package 课后习题.Step3数组;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/23/22:03
 * @Description:
 **/
/*
题目描述
给定三个整数数组
A = [A1, A2, ... AN],
B = [B1, B2, ... BN],
C = [C1, C2, ... CN]，
请你统计有多少个三元组(i, j, k) 满足：
1. 1 <= i, j, k <= N
2. Ai < Bj < Ck
输入
第一行包含一个整数N。
第二行包含N个整数A1, A2, ... AN。
第三行包含N个整数B1, B2, ... BN。
第四行包含N个整数C1, C2, ... CN。
1 <= N <= 100000 0 <= Ai, Bi, Ci <= 100000
输出
一个整数表示答案
样例输入 Copy
3
1 1 1
2 2 2
3 3 3
样例输出 Copy
27
 */
public class 递增三元组2018 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//每行包含n个整数
        int t;
        long arr[] =new long[100005];
        for (int i = 0; i <n ; i++) {
            t=scanner.nextInt()+1;//输入每行的数字,0不好处理所以加 1
            arr[t]++;//t的出现次数多了一次
        }
        for (int i = 1; i <arr.length ; i++) {//对arr数组进行前缀和
            arr[i]+=arr[i-1];
        }
        long brr[] =new long[100005];
        for (int i = 0; i <n ; i++) {
            t=scanner.nextInt()+1;//输入每行的数字,0不好处理所以加 1
            brr[t]+=arr[t-1];//t的出现次数多了一次
        }
        for (int i = 1; i <brr.length ; i++) {//对arr数组进行前缀和
            brr[i]+=brr[i-1];
        }
        long crr[] =new long[100005];
        for (int i = 0; i <n ; i++) {
            t=scanner.nextInt()+1;//输入每行的数字,0不好处理所以加 1
            crr[t]+=brr[t-1];//t的出现次数多了一次
        }
        for (int i = 1; i <crr.length ; i++) {//对arr数组进行前缀和
            crr[i]+=crr[i-1];
        }
        System.out.println(crr[crr.length-1]);
    }
}