package 课后习题.Step1API学习;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/19/22:26
 * @Description:方法一：因为2*5=10，所以只需把全部的数分解为2和5的质因数，看有多少个2和5相乘即可。取2和5中个数少的
 * 方法二：运用java特有的BigInteger无视数的大小限制直接进行运算，暴力输出最终100个数乘积的大小
 **/
/*
题目描述
如下的10行数据，每行有10个整数，请你求出它们的乘积的末尾有多少个零？


5650 4542 3554 473 946 4114 3871 9073 90 4329
2758 7949 6113 5659 5245 7432 3051 4434 6704 3594
9937 1173 6866 3397 4759 7557 3070 2287 1453 9899
1486 5722 3135 1170 4014 5510 5120 729 2880 9019
2049 698 4582 4346 4427 646 9742 7340 1230 7683
5693 7015 6887 7381 4172 4341 2909 2027 7355 5649
6701 6645 1671 5978 2704 9926 295 3125 3878 6785
2066 4247 4800 1578 6652 4616 1113 6205 3264 2915
3966 5291 2904 1285 2193 1428 2265 8730 9436 7074
689 5510 8243 6114 337 4096 8199 7313 3685 211

输出
输出一个整数表示答案
 */
public class 乘积尾零2018 {
    public static void main(String[] args) {
//        int arr[]={5650,4542,3554,473,946,4114,3871,9073,90,4329,
//                2758,7949,6113,5659,5245,7432,3051,4434,6704,3594,
//                9937,1173,6866,3397,4759,7557,3070,2287,1453,9899,
//                1486,5722,3135,1170,4014,5510,5120,729,2880,9019,
//                2049,698,4582,4346,4427,646,9742,7340,1230,7683,
//                5693,7015,6887,7381,4172,4341,2909,2027,7355,5649,
//                6701,6645,1671,5978,2704,9926,295,3125,3878,6785,
//                2066,4247,4800,1578,6652,4616,1113,6205,3264,2915,
//                3966,5291,2904,1285,2193,1428,2265,8730,9436,7074,
//                689,5510,8243,6114,337,4096,8199,7313,3685,211};
//        int a2=0;
//        int a5=0;
//        for (int i = 0; i <100 ; i++) {
//            while (true) {   //while (arr[i]>0)
//                if (arr[i]%2==0){
//                    a2++;
//                    arr[i]=arr[i]/2;
//                }
//                else  if (arr[i]%5==0){
//                    a5++;
//                    arr[i]=arr[i]/5;
//                }
//                else
//                    break;    //arr[i]=0;
//            }
//        }
//        if (a2<a5)
//            System.out.println(a2);
//        else
//            System.out.println(a5);
        BigInteger sum =new BigInteger("1");
        Scanner scanner=new Scanner(System.in);
        int n=10;
        long startTime=System.currentTimeMillis();   //获取开始时间
        while (n-->0){

            String str=scanner.nextLine();
            String str1[]=str.split(" ");
            //BigInteger big =new BigInteger("1");
            //BigInteger sum =new BigInteger("1");

            for (int i = 0; i<10 ; i++) {
                BigInteger big=new BigInteger(str1[i]);
                    sum=sum.multiply(big);
            }
        }
        System.out.println(sum);//最终这100个数相乘的结果,尾数0的个数查一下就知道了，此处不写代码来算0的个数了

        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    }
}

//        Scanner scanner=new Scanner(System.in);
//
//        while (scanner.hasNext()){
//
//            String str=scanner.nextLine();
//            String str1[]=str.split(" ");
//            BigInteger big = null;
//            BigInteger sum=null;
//            for (int i = 0; i <str1.length ; i++) {
//                    //num*=Long.valueOf(str1[i]);
//                 big=new BigInteger(str1[i]);
//                sum=big.multiply(sum);
//
//            }
//            System.out.println(sum);
//            //String s=String.valueOf(num);
//
//        }







