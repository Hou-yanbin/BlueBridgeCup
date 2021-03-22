package 课后习题.Step2流程控制;

import java.util.Scanner;
import java.lang.Math;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/22/16:11
 * @Description:将数组组织起来，按照m,n的下标，m的纵下标-n的纵下标结果的绝对值加上m的横下标-n的横下标结果的绝对值，就是最终距离
 **/
/*
题目描述
X星球居民小区的楼房全是一样的，并且按矩阵样式排列。
其楼房的编号为1,2,3... 当排满一行时，从下一行相邻的楼往反方向排号。
比如：当小区排号宽度为6时，开始情形如下：
1  2  3  4  5  6
12 11 10 9  8  7
13 14 15 .....
我们的问题是：已知了两个楼号m和n，需要求出它们之间的最短移动距离
（不能斜线方向移动）
输入
输入存在多组测试数据
输入为3个整数w m n，空格分开，都在1到10000范围内
w为排号宽度，m,n为待计算的楼号。
输出
要求输出一个整数，表示m n 两楼间最短移动距离。
样例输入 Copy
6 8 2
4 7 20
样例输出 Copy
4
5
 */
public class 移动距离2015 {
    static int mi,mj,ni,nj;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int w=scanner.nextInt();
            int m=scanner.nextInt();
            int n=scanner.nextInt();
            int[][] arr=new int[10000/w+2][w];
            for (int i = 0; i <=10000/w; i++) {
                if ((i+1)%2!=0){
                    int num=i*w+1;
                    if (i==10000/w){
                        for (int j = 0; j <10000%w; j++) {
                            arr[i][j]=num;
                            num++;
                        }
                    }
                    else
                    for (int j = 0; j <w; j++) {
                         arr[i][j]=num;
                         num++;
                    }
                }
                    if ((i+1)%2==0){
                        int num=i*w+1;
                        if (i==10000/w){
                            for (int j = 0; j <10000%w; j++) {
                                arr[i][j]=num;
                                num++;
                            }
                        }
                        else
                            for (int j = w-1; j >=0; j--) {
                            arr[i][j]=num;
                            num++;
                        }
                }
            }
//            for (int i = 0; i <=10000/w; i++) {
//                for (int j = 0; j < w; j++) {
//                    System.out.print(arr[i][j]+" ");
//                }
//                System.out.println();
            for (int i = 0; i <=10000/w; i++) {
                for (int j = 0; j < w; j++) {
                    if (arr[i][j]==m){
                        mi=i;
                        mj=j;
                    }
                    if (arr[i][j]==n){
                        ni=i;
                        nj=j;
                    }

                }
            }
           System.out.println(Math.abs(mi-ni)+ Math.abs(mj-nj));
        }
    }
}
//            for (int i = 0; i <10000/w; i++) {
//                for (int j = 0; j < w; j++) {
//                    System.out.print(arr[i][j]+" ");
//                }
//                System.out.println();
//            }
