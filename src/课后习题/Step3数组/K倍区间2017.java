package 课后习题.Step3数组;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/25/21:41
 * @Description:
 **/
/*
题目描述
给定一个长度为N的数列，A1, A2, ... AN。
如果其中一段连续的子序列Ai, Ai+1, ... Aj(i <= j)之和是K的倍数，我们就称这个区间[i, j]是K倍区间。
你能求出数列中总共有多少个K倍区间吗？
输入
第一行包含两个整数N和K。(1 <= N, K <= 100000)
以下N行每行包含一个整数Ai。(1 <= Ai <= 100000)
输出
输出一个整数，代表K倍区间的数目。
样例输入 Copy
5 2
1
2
3
4
5
样例输出 Copy
6
 */
public class K倍区间2017 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        long arr[] =new long[n+1];
        long buf[] =new long[k];
        buf[0]++;//为了后来的数列求和，第一项为1
        for (int i = 1; i <=n ; i++) {
            arr[i]=scanner.nextInt();
            arr[i]+=arr[i-1];//前缀和
            buf[(int)(arr[i]%k)]++;//前缀和arr[i]%k取余的余数的个数加一（计数）
        }
        long ans=0;
        for (int i = 0; i <k; i++) {
            ans+=(((buf[i]-1)*buf[i])/2);//前缀和以测试用例为例buf[0]=3,buf[1]=3,则以buf【0】为例有三个余数为3的数，
            // 则可以组成3个区间，1-2,1-3,2-3，三根柱子，最少一个区间，最多2个区间组合在一起，所以构成等差数列
        }
        System.out.println(ans);
    }
}