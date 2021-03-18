package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/21:56
 * @Description:
 **/
/*
有一头母牛，它每年年初生一头小母牛。每头小母牛从第四个年头开始，每年年初也生一头小母牛。请编程实现在第n年的时候，共有多少头母牛？
Input
输入数据由多个测试实例组成，每个测试实例占一行，包括一个整数n(0<n<55)，n的含义如题目中描述。
n=0表示输入数据的结束，不做处理。
Output
对于每个测试实例，输出在第n年的时候母牛的数量。
每个输出占一行。
Sample Input
2
4
5
0
Sample Output
2
4
6
 */
public class 母牛生小牛数量 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();

            if (n==0){
                break;
            }
            if (0<n&&n<=4){
                System.out.println(n);
            }
            if (n>4&&n<55)
                System.out.println(fun(n));
        }
    }
    public static int fun(int x){
        if (x==1){
            return 1;
        }
        if (x==2){
            return 2;
        }
        if (x==3){
            return 3;
        }
        if (x==4){
            return 4;
        }
        else
            return fun(x-1)+fun(x-3);
    }
}
