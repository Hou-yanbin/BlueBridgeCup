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
        int m=0;
        for (int i = 0; i < 1000; i++) {
            pfh+=Math.pow(2,i);
            if (pfh>=n){
                m=(i+1);
                break;
            }
        }
        int[][] arr=new int[m][(int)Math.pow(2,(m-1))];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <Math.pow(2,i) ; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
        int sum=0;
        int max=0;
        int index=0;
        int[] sumCount=new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < Math.pow(2, i); j++) {
                sum += arr[i][j];
            }
            sumCount[i] = sum;
            sum=0;
        }
        int num=sumCount[0];
        for (int i = 0; i <m-1 ; i++) {
            if ( num== sumCount[i+1]) {
                System.out.println("1");
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