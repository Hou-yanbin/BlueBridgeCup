package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/18:09
 * @Description:
 **/
/*
有一个长度为n(n<=100)的数列，该数列定义为从2开始的递增有序偶数，现在要求你按照顺序每m个数求出一个平均值，如果最后不足m个，则以实际数量求平均值。编程输出该平均值序列。

Input
输入数据有多组，每组占一行，包含两个正整数n和m，n和m的含义如上所述。

Output
对于每组输入数据，输出一个平均值序列，每组输出占一行。

Sample Input
3 2

4 2

Sample Output
3 6

3 7

分析
数列：2，4，6，8，10，12，14，16，18，20，22，24 …… 2n

每 m 个数求出一个平均值，即求这 m 个数中的“第一个数和最后一个数的平均值”

假设 q = n /m ; r = n % m ;（q = 1，2，3，4 ……   ；  r = 0，1，2，3 ……   ；即数列可分成 q 组余 r 个数） 则：

m 个数一组的时候：

第一个数：2 * [ ( q -1) * m + 1 ]       最后一个数：2 * q * m       平均值：2 * q * m - m + 1

最后不足 m 个数的时候：

第一个数：2 * [ ( q -1) * m + 1 ]      最后一个数：2 * [ ( q -1) * m + r ]         平均值：2 * q * m - 2 * m + r + 1
 */
public class 有序偶数控距求平均 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int q = n / m;
            int r = n % m;
            int i = 1;
            for (; i <= q; i++) {
                System.out.print(2 * i * m - m + 1);
                if (i != q) System.out.print(" ");
            }
            if (r != 0) System.out.print(" " + (2 * (i) * m - 2 * m + r + 1));
            System.out.println();
        }
    }
}
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            int n=scanner.nextInt();
//            int num=scanner.nextInt();
//            int[] arr=new int[n];
//            for (int i = 0; i <n; i++) {
//                arr[i]=(i+1)*2;
//            }
//            int[] arrs;
//            if (num%2==0){
//            arrs=new int[n/num];
//            }
//            else {
//                 arrs = new int[n / num + 1];
//            }
//            for (int i = 0; i < arr.length; i=i+num) {
//                arrs[i]=arr[i]+arr[i+1]
//                ;
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//            }
//        }

