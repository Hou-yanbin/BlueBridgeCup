package 课后习题.Step3数组;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/24/17:08
 * @Description:
 **/
/*
问题描述：
上图给出了一个数字三角形。从三角形的顶部到底部有很多条不同的路径。
对于每条路径，把路径上面的数加起来可以得到一个和，你的任务就是找到最大的和。
路径上的每一步只能从一个数走到下一层和它最近的左边的那个数或者右边的那个数。
此外，向左下走的次数与向右下走的次数相差不能超过 1。
输入格式:
输入的第一行包含一个整数 N (1 < N ≤ 100)，表示三角形的行数。下面的N 行给出数字三角形。
数字三角形上的数都是 0 至 100 之间的整数。
输出格式：
输出一个整数，表示答案。
样例输入：
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
样例输出：
27
 */
public class 数字三角形2020 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int[n+1][n+1];
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                arr[i][j]=scanner.nextInt();
                arr[i][j]+=Math.max(arr[i-1][j-1],arr[i-1][j]);//寻找动态规划方程：从第一个元素累加上一行的左右两边的数取最大值//没有赋值的数组元素都为零
            }
        }
        System.out.println(n%2==0?Math.max(arr[n][n/2],arr[n][n/2+1]):arr[n][n/2+1]);
    }
}