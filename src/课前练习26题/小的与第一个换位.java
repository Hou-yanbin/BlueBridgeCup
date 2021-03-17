package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/20:48
 * @Description:
 **/
/*
输入n(n<100)个数，找出其中最小的数，将它与最前面的数交换后输出这些数。
Input
输入数据有多组，每组占一行，每行的开始是一个整数n，表示这个测试实例的数值的个数，跟着就是n个整数。n=0表示输入的结束，不做处理。
Output
对于每组输入数据，输出交换后的数列，每组输出占一行。
Sample Input
4 2 1 3 4
5 5 4 3 2 1
0
Sample Output
1 2 3 4
1 4 3 2 5
分析：题目的要求：找到最小的数和第一个数进行交换，而后依次输出，因此第一想到的方法是：选择排序法。java

须要用到的有数组，min，位置数：k数组

用数组a[]来接收输入的数据测试

用min记住第一个输出的数a[0]，依次和接下来的数进行比较，找到最小的数，若是有，用k记住他的位置，若是没有，k=0也就是a[0]spa

int min=a[0];排序

因此用到for(int i=0;i<n;i++){ip

    if(min<a[i]){it

        min=a[i];io

         k=i;class

     }

import

}

而后判断 k==0？

若是不等于

就将a[0]和a[k]进行交换，a[k]就是最小的数。
 */
public class 小的与第一个换位 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            if (n==0)
            {
                break;
            }
            int[] arr=new int[n];
            arr[0]=scanner.nextInt();
            int min=arr[0];
            int k=0;
            for (int i = 1; i <n ; i++) {
                arr[i]=scanner.nextInt();
                if (min>arr[i]){
                    min=arr[i];
                    k=i;
                }
            }
            if (k!=0){
                int temp=arr[0];
                arr[0]=arr[k];
                arr[k]=temp;
            }
            for (int i = 0; i < n-1; i++) {
                System.out.print(arr[i]+" ");//输出到倒数第二项,
            }
            System.out.println(arr[n-1]);   //单独输出最后一项然后换行,将最后一个的空格巧妙地去除
        }
    }
}