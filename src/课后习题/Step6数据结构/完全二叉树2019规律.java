package 课后习题.Step6数据结构;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/8/19:44
 * @Description:
 **/
/*
https://blog.csdn.net/weixin_46371813/article/details/114455280?utm_medium=distribute.pc_relevant.none-task-blog-baidujs_title-0&spm=1001.2101.3001.4242
根据如上规律再加上输入的格式是线性的，就可以使用两层循环，第一个循环控制每一层的节点，即控制层数，第二层循环开始从每一层的首节点开始遍历当层的每一个数据并实行累加，
数据完毕之后可假设该二叉树第一个元素为最大，之后下面的累加后的和与最大进行比较，使用一个变量记录最大数的所在层数
需要注意的一点，累加的结果变量和数组需要使用long类型
 */
    /*
    将n个数全部输入到arr数组中，将arr[1]第一个元素作为最小值，for (int i = 1; i <n; i=i*2) {//每次i的值都为当前层数的首节点编号(很巧妙)，
     */
public class 完全二叉树2019规律 {
    static int N=100010;
    static long[] arr=new long[N];
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int n=scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            arr[i]=scanner.nextInt();
        }
        long max=arr[1];//默认第一个数为最大
        long deep=1;//默认第一层开始遍历
        long a=1;//用于存放层数
        //进行遍历处理
        for (int i = 1; i <n; i=i*2) {//每次i的值都为当前层数的首节点编号
            long res=0;
            for (int j = i; j <=Math.pow(2,i-1)&&j<=n ; j++) {//注意有可能会出现最后一行数字大于N的现象，所以要限制一下。
                res=res+arr[j];//累加一层的数字
            }
            if (max<res){//如果一行的和大于max则进行替换，且替换a所代表的层数，
                a=deep;
                max=res;
            }
            deep++;
        }
        System.out.println(a);
    }
}









