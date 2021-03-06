package 课后习题.Step3数组;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/27/13:21
 * @Description:
 **/
/*
【问题描述】
图片旋转是对图片最简单的处理方式之一，在本题中，你需要对图片顺时 针旋转 90 度。 我们用一个 n×m 的二维数组来表示一个图片，例如下面给出一个 3×4 的 图片的例子：
1 3 5 7 9 8 7 6 3 5 9 7
这个图片顺时针旋转 90 度后的图片如下：
3 9 1 5 8 3 9 7 5 7 6 7
给定初始图片，请计算旋转后的图片。
【输入格式】
输入的第一行包含两个整数 n 和 m，分别表示行数和列数。 接下来 n 行，每行 m 个整数，表示给定的图片。图片中的每个元素（像 素）为一个值为 0 至 255 之间的整数（包含 0 和 255）。
【输出格式】
输出 m 行 n 列，表示旋转后的图片。
试题F: 旋转 7
【样例输入】 3 4
          1 3 5 7
          9 8 7 6
          3 5 9 7
【样例输出】 3 9 1
          5 8 3
          9 7 5
          7 6 7
【评测用例规模与约定】 对于 30% 的评测用例，1≤n,m≤10。 对于 60% 的评测用例，1≤n,m≤30。 对于所有评测用例，1≤n,m≤100。
 */
public class 旋转2019 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int[][] arr=new int[n+1][m+1];
        int[][] num=new int[m+1][n+1];
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n; j++) {
                num[i][j]=arr[n-j+1][i];//num[i][j]=arr[n-j+1][i];最重要的部分
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }
}