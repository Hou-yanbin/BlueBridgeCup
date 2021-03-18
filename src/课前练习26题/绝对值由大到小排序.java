package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/18/8:10
 * @Description:
 **/
/*
输入n(n<=100)个整数，按照绝对值从大到小排序后输出。题目保证对于每一个测试实例，所有的数的绝对值都不相等。
Input
输入数据有多组，每组占一行，每行的第一个数字为n,接着是n个整数，n=0表示输入数据的结束，不做处理。
Output
对于每个测试实例，输出排序后的结果，两个数之间用一个空格隔开。每个测试实例占一行。
Sample Input
3 3 -4 2
4 0 1 2 -3
0
Sample Output
-4 3 2
-3 2 1 0
 */
public class 绝对值由大到小排序 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[100];
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            if (n==0){
                break;
            }
            for (int i = 0; i < n; i++) {
                arr[i]=scanner.nextInt();
            }
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (Math.abs(arr[j]) < Math.abs(arr[j+1])) {  //在排序时进行绝对值比较而对原数列排序,从而不影响原数列的数值
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
            }


            }
            for (int i = 0; i <n ; i++) {
                System.out.print(arr[i]);
                if (i!=n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}