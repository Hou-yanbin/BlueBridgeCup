package 课后习题.Step4容器;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/31/17:45
 * @Description:
 **/
/*
题目描述
给定N 个加号、M 个减号以及N + M + 1 个整数A1,A2,...,AN+M+1
小明想知道在所有由这N 个加号、M 个减号以及N + M +1 个整数凑出的合法的后缀表达式中，结果最大的是哪一个？
请你输出这个最大的结果。
例如使用1 2 3 + -，则“2 3 + 1 -” 这个后缀表达式结果是4，是最大的。
输入
第一行包含两个整数N 和M。
第二行包含N + M + 1 个整数A1,A2,...,AN+M+1
0<=N,M<=100000,-10^9<=Ai<=10^9
输出
输出一个整数，代表答案。
样例输入 Copy
1 1
1 2 3
样例输出 Copy
4
 */
public class 后缀表达式2019 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int num=N+M+1;
        int sum=0;
        long arr[]=new long[num];//定义N+M+1个整数的数组
        for (int j = 0; j < arr.length; j++) {
            arr[j]=scanner.nextInt();
        }
        Arrays.sort(arr);//对输入的N+M=1个数进行排序
        for (int  i= arr.length-1; i >=arr.length-N-1;i--) {
            sum+=arr[i];//将大的数字都加上(已排序)有几个加号就加加号个数加一次（原因第一次是0加排序后的最后一个数，不算这一次还要加加号的个数次）(从大往小加)
        }
        for (int i=0;i<M;i++) {
            sum-=arr[i];//将小的数字都减去(已排序)有几个减号就减几次(从小往大减)
        }
        System.out.println(sum);
    }
}