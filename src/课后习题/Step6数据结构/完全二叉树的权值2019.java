package 课后习题.Step6数据结构;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/8/10:54
 * @Description:
 **/
public class 完全二叉树的权值2019 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int pfh=0;
        int pfh1=0;
        int m=0;
        for (int i = 0; i < 100000; i++) {
            pfh+=Math.pow(2,i);

            if (pfh>=n){
                m=(i+1);
                pfh1=pfh-(int)Math.pow(2,i);
                break;
            }
        }
        int[][] arr=new int[m][(int)Math.pow(2,(m-1))];
        for (int i = 0; i <m ; i++) {
            if (i==m-1){
            for (int j = 0; j < n-pfh1; j++) {

                arr[i][j]=scanner.nextInt();
            }}
            else {
                for (int j = 0; j < Math.pow(2, i); j++) {

                    arr[i][j] = scanner.nextInt();
                }
            }
        }
        long sum=0;
        long max=Long.MIN_VALUE;
        int index=0;
        long[] sumCount=new long[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < Math.pow(2, i); j++) {
                sum += arr[i][j];
            }
            sumCount[i] = sum;
            sum=0;
        }
        long num=sumCount[0];
        for (int i = 0; i <m-1 ; i++) {
            if ( num== sumCount[i+1]) {
                System.out.println(i);
                return;
            }
            if (sumCount[i] > max) {
                max = sumCount[i];
                index = i;
            }

        }

        System.out.println(index+1);
    }
}