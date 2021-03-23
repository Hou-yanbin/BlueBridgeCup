package 课后习题.Step3数组;

import java.util.Arrays;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/23/19:53
 * @Description:纵向循环排列
 **/
public class 输出杨辉三角的指定一行 {
    public static void main(String[] args) {
        int n=10;//表示要输出杨辉三角的层数
        int arr[][]=new int[2][n+2];//定义两行n+1列的数
        arr[0][1]=1;
        for (int i = 1; i <=n+1 ; i++) {
            for (int j = 1; j < i+1; j++) {
                arr[i%2][j]=arr[1-i%2][j]+arr[1-i%2][j-1];
            }
        }
        System.out.println(Arrays.toString(arr[0]));
        //System.out.println(Arrays.toString(arr[1]));
    }
}