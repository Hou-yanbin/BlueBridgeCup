package 课后习题.Step5函数;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/4/19:45
 * @Description:
 **/
public class 等差数列2019 {
    public static long diff;
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);

        int diff=0;
        for (int i = 0; i <n-1; i++) {
         diff=gcd(diff,arr[i+1]-arr[i]);//diff差值和循环的两项之间的差值寻找最大的公约数，即为差值
        }

        if (diff==0){
            System.out.println(n);
        }
        else {
            long count=0;
            System.out.println((arr[n-1]-arr[0])/diff+1);
        }
    }
    public static int gcd(int a,int b) {//欧几里得算法（辗转相除法）
        return b!=0?gcd(b, a%b):a;//求两个正整数的最大公约数//0与一个数的最大公约数，就是这个数本身
    }

}
//    public static boolean quandeng(long[] x){
//        for (int i = 0; i <x.length-1; i++) {
//            if (x[i]!=x[i+1]){
//                return false;
//            }
//        }
//        return true;
//    }

//    public static int maxCommonDivisor(int m, int n) {
//        if (m < n) {// 保证m>n,若m<n,则进行数据交换
//            int temp = m;
//            m = n;
//            n = temp;
//        }
//        if (m % n == 0) {// 若余数为0,返回最大公约数
//            return n;
//        } else { // 否则,进行递归,把n赋给m,把余数赋给n
//            return maxCommonDivisor(n, m % n);
//        }
