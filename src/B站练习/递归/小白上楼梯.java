package B站练习.递归;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/6/10:55
 * @Description:>小白正在上楼梯，楼梯有n阶台阶，小白一次可以上1阶，2阶或者3阶，实现一个方法，计算小白有多少种走完楼梯的方式。
 * 快到达楼梯顶时只有3种可能剩余1个,2个,3个台阶,
 * 设n阶台阶的走法数为f(n)。如果只有1个台阶，走法有1种（一步上1个台阶），即f(1)=1；
 * 如果有2个台阶，走法有2种（一种是上1阶，再上1 阶，另一种是一步上2阶），即f(2)=2；
 * 如果有3个台阶，走法有4种（一种每次1阶，共一种；另一种是2+1，共两种；第三种是3，共1种），即 f(3)=4；
 *
 * 当有n个台阶（n>3）时，我们缩小问题规模，可以这样想：最后一步有三种情况，
 * 走1步（之前上了n-1个台阶，走法为f(n-1)种），
 * 走2步（之前上了 n-2个台阶，走法为f(n-2)种），
 * 走3步，（之前上了n-3个台阶，走法为f(n-3)种，f(n)=f(n-1)+f(n-2)+f(n-3),n>3
 **/
public class 小白上楼梯 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int res = f(n);
            System.out.println(res);
        }
    }
    private static int f(int n){
        if (n==0)
            return 1;//验证加一
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        return f(n-1)+f(n-2)+f(n-3);
    }
}