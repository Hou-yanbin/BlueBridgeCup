package 蓝桥杯决赛练习;

import java.util.Arrays;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/5/30/21:13
 * @Description:
 **/
public class 输出指定层的杨辉三角 {
    public static void main(String[] args) {
        int n=10;
        int arr[][]=new int[2][n+2];//从1开始防止爆炸
        arr[0][1]=1;
        for (int i = 1; i <= n+1; i++) {
            for (int j = 1; j <i+1 ; j++) {
                arr[i%2][j]=arr[1-i%2][j]+arr[1-i%2][j-1];
                System.out.print(arr[i%2][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
    }
}