package B站练习.递归;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/5/16:51
 * @Description:
 **/
public class 斐波那契数列 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i)+" ");
        }
        System.out.println();
        System.out.println(fib(8));//21
    }
    static int fib(int n){
        if (n==0)
            return 0;
        if (n==1||n==2)
            return 1;
        //System.out.println(fib(n-1)+fib(n-2));
        return fib(n-1)+fib(n-2);
    }
}