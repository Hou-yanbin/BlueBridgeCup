package 课后习题.Step4容器;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/30/11:45
 * @Description:
 **/
/*
题目描述
如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。对新产生的正整数再做同样的处理。
如此一来，你会发现，不管开始取的是什么数字，最终如果不是落入1，就是落入同一个循环圈。
请写出这个循环圈中最大的那个数字。00.
 */
public class 平方怪圈2016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
    int max=0;
for (int i = 0; i <5000; i++) {
//求出这个数的每一位
    int ge=a%10;
    int shi=a/10%10;
    int bai=a/100%10;
    int qian=a/1000%10;
    int wan=a/10000%10;
    int shiwan=a/100000%10;

//把每一位的平方相加重新赋值
a=ge*ge+shi*shi+bai*bai+qian*qian+wan*wan+shiwan*shiwan;

//作比较记录最大的
if (a>max) {
    max=a;
    }
}
System.out.println(max);//System.out.println("145");

    }
}