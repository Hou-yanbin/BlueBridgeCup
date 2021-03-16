package 第十届;
/*
给定数列 1, 1, 1, 3, 5, 9, 17, …，从第 4 项开始，每项都是前 3 项的和。
求第 20190324 项的最后 4 位数字。
 */
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/3/15:42
 * @Description: 最主要的就是把数变短，做法就是每一项都对10000区域，将每一项的大小都限制在10000以内，这道题输出的是后四位，所以没有影响。
 * 代码2是我更改后的答案，可以直接输出满足题目要求的数。
 **/
public class 数列求值 {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int c=1;
        int n=20190324;
        for (int i=4;i<=n;i++){
            if (i%3==1){
                a=(a+b+c)%10000;
            }
            else if (i%3==2){
                b=(a+b+c)%10000;
            }
            else if (i%3==0){
                c=(a+b+c)%10000;
            }

        }
        if (n%3==1){
            System.out.println(a);
        }
        else if (n%3==2){
            System.out.println(b);
        }
        else if (n%3==0){
            System.out.println(c);
        }
        int d=10023;
        System.out.println(d%10000);
//        int n = 20190324;
//        int a = 1;
//        int b = 1;
//        int c = 1;
//        for(int i = 4; i <= n; i++) {
//            if(i % 3 == 1) {
//                a = (a + b + c) % 10000;
//            }else if(i % 3 == 2) {
//                b = (a + b + c) % 10000;
//            }else {
//                c = (a + b + c) % 10000;
//            }
//        }
//        if(n % 3 == 1) {
//            System.out.println(a);
//        }else if( n % 3 == 2) {
//            System.out.println(b);
//        }else {
//            System.out.println(c);
//        }

    }
}