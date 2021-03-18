package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/15/18:07
 * @Description:
 **/
/*
根据输入的半径值，计算球的体积。
Input
输入数据有多组，每组占一行，每行包括一个实数，表示球的半径。
Output
输出对应的球的体积，对于每组输入数据，输出一行，计算结果保留三位小数。
Sample Input
1
1.5
Sample Output
4.189
14.137



Hint
#define PI 3.1415927
 */
public class 计算球的体积 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            double radius;
            radius =scanner.nextDouble();
            System.out.println(String.format("%.3f",((4*3.1415927*Math.pow(radius,3))/3)));
        }
    }
}