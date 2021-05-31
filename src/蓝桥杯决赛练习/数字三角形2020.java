package 蓝桥杯决赛练习;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/5/31/23:04
 * @Description:
 **/
public class 数字三角形2020 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int[n+2][n+2];
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                arr[i][j]=scanner.nextInt();
                arr[i][j]+=Math.max(arr[i-1][j-1],arr[i-1][j]);
            }
        }
        System.out.println(n%2==0?Math.max(arr[n][n/2],arr[n][n/2+1]):arr[n][n/2+1]);
    }
}