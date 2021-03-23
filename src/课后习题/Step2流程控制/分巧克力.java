package 课后习题.Step2流程控制;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/21/22:47
 * @Description:运用2分法将K个巧克力的长宽与mid进行2分取证，再将整后的数字相乘累加，得到最后总共的巧克力块个数(当分割后的巧克力的个数和大于等于小朋友个数则结束循环），因为只要分最大就是对半（二分法），在pos时正好是成立的，加1就不可以了
 **/
/*
题目描述
儿童节那天有K位小朋友到小明家做客。小明拿出了珍藏的巧克力招待小朋友们。
小明一共有N块巧克力，其中第i块是Hi x Wi的方格组成的长方形。
为了公平起见，小明需要从这 N 块巧克力中切出K块巧克力分给小朋友们。切出的巧克力需要满足：
1. 形状是正方形，边长是整数
2. 大小相同
例如一块6x5的巧克力可以切出6块2x2的巧克力或者2块3x3的巧克力。
当然小朋友们都希望得到的巧克力尽可能大，你能帮小Hi计算出最大的边长是多少么？
输入
第一行包含两个整数N和K。(1 <= N, K <= 100000)
以下N行每行包含两个整数Hi和Wi。(1 <= Hi, Wi <= 100000)
输入保证每位小朋友至少能获得一块1x1的巧克力。
输出
输出切出的正方形巧克力最大可能的边长。
样例输入 Copy
2 10
6 5
5 6
样例输出 Copy
2
 */
public class 分巧克力 {
    public static int h[],w[],n,k;//巧克力的长宽//定于两个数组专门用来存储各个巧克力的长和宽
    public static boolean check(int size){
        int sum=0;//当前巧克力分割的个数
        for (int i = 0; i <n ; i++) {//从第一个巧克力开始到第n个结束
            sum+=(w[i]/size)*(h[i]/size);//宽度除以size，进行一个向下的取整，长度除以size，进行一个向下的取整，两项相乘即是这个大巧克力可以分割的小正方形的个数
        }
        return sum>=k;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n= scanner.nextInt();//n块巧克力
        k= scanner.nextInt();//k个小朋友
        h=new int[n];
        w=new int[n];
        for (int i = 0; i < n; i++) {//获取n块巧克力的长和宽
            h[i]=scanner.nextInt();
            w[i]=scanner.nextInt();
        }
        int left=0,right=100000,mid=0;
        while (left<=right){//小于等于，遍历获得最适合的中间值（越来越接近最终答案），
            mid=(left+right)/2;//获取中间值
            boolean test0=check(mid),test1=check(mid+1);//mid可以(mid+1)不可以
            if (test0&&!test1){
                break;
            }else if (test0&&test1){//当前不行则在mid左边
                left=mid+1;
            }else
                right=mid-1;//当前不行则在mid右边
        }
        System.out.println(mid);
    }
}