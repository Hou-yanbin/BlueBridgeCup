package 课后习题.Step2流程控制;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/21/15:41
 * @Description:
 * 你可以拿a+b＝c
 * a,b其中一个一定小于等会c/2
 * 所以a,b,c,d中a小于等于n/4,然后b小于等于n/3所以求每一项的可能情况
 * //a,b,c,d假设一种极端的情况（考虑每项最大的情况，若想a最大则a，b，c，d四个值相等，相当于n被分成了四份，在开跟方，
 * 若想b最大则a等于0，再将n/3开跟，。。。这样每一项由上而下可以算出符合d>=c&&d*d==n的数的组合
 **/
/*
题目描述
四平方和定理，又称为拉格朗日定理：每个正整数都可以表示为至多4个正整数的平方和。
如果把0包括进去，就正好可以表示为4个数的平方和。
比如：
5 = 0^2 + 0^2 + 1^2 + 2^2
7 = 1^2 + 1^2 + 1^2 + 2^2（^符号表示乘方的意思）
对于一个给定的正整数N，可能存在多种平方和的表示法。
要求你对4个数排序：0 <= a <= b <= c <= d
并对所有的可能表示法按 a,b,c,d 为联合主键升序排列，最后输出第一个表示法
输入
输入存在多组测试数据，每组测试数据输入一行为一个正整数N (N<5000000)
输出
对于每组测试数据，要求输出4个非负整数，按从小到大排序，中间用空格分开
样例输入 Copy
5
12
773535
样例输出 Copy
0 0 1 2
0 2 2 2
1 1 267 838
 */
public class 四平方和2016 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            boolean ok=false;
            for (int a =0;!ok&& a <=Math.sqrt(n/4); a++) {//最大，平分成4分，
                n-=a*a;
                for (int b = 0;!ok&& b <=Math.sqrt(n/3) ; b++) {//假设第一个为0，分成3份
                    n-=b*b;
                    for (int c = 0;!ok&& c <=Math.sqrt(n/2) ; c++) {//假设第一和第二个为0，分成3份
                        n-=c*c;
                        int d= (int) Math.sqrt(n);
                        if (d>=c&&d*d==n){   //d*d==n因为在上一步d是取整得到的，有可能d*d不等于n
                            System.out.println(a+" "+b+" "+c+" "+d);
                            ok=true;
                        }
                       n+=c*c;
                    }
                   n+=b*b;
                }
               n+=a*a;
            }


        }

    }

}