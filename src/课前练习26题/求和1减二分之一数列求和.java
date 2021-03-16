package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/16/17:29
 * @Description:
 **/
/*
多项式的描述如下：
1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + ...
现在请你求出该多项式的前n项的和。
Input
输入数据由2行组成，首先是一个正整数m（m<100），表示测试实例的个数，第二行包含m个正整数，对于每一个整数(不妨设为n,n<1000），求该多项式的前n项的和。
Output
对于每个测试实例n，要求输出多项式前n项的和。每个测试实例的输出占一行，结果保留2位小数。
Sample Input
2
1 2
Sample Output
1.00
0.50
 */
public class 求和1减二分之一数列求和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        while (n-->0){
            int m=scanner.nextInt();
            int flag=1;
            double sum=0;
            for (int i = 1; i <= m; i++) {
                sum+=(double)(flag*(1.0/i));
                flag=-flag;
            }
//            System.err.println("%.2f",sum);
            System.err.printf("%.2f",sum);
            System.err.println();
        }

    }
}
//    int n = scanner.nextInt();
//
//        while (scanner.hasNext()) {
//            System.out.println();
//                double[] arr = new double[1000];
//                for (int j = 0; j < n; j++) {
//        arr[j] = scanner.nextInt();
//        }
//        for (int j = 0; j < n; j++) {
//        double sum = 0;
//        for (int i = 0; i < arr[i]; ++i) {
//
//        if (arr[i] % 2 == 0) {
//        sum = sum - (1 / arr[i]);
//
//        } else
//        sum = sum + (1 / arr[i]);
//
//        }
//        System.out.println(sum);
//
//        }
//
//        }