package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/18/9:04
 * @Description:
 **/
/*
作为杭电的老师，最盼望的日子就是每月的8号了，因为这一天是发工资的日子，养家糊口就靠它了，呵呵
但是对于学校财务处的工作人员来说，这一天则是很忙碌的一天，财务处的小胡老师最近就在考虑一个问题：如果每个老师的工资额都知道，最少需要准备多少张人民币，才能在给每位老师发工资的时候都不用老师找零呢？
这里假设老师的工资都是正整数，单位元，人民币一共有100元、50元、10元、5元、2元和1元六种。
Input
输入数据包含多个测试实例，每个测试实例的第一行是一个整数n（n<100），表示老师的人数，然后是n个老师的工资。
n=0表示输入的结束，不做处理。
Output
对于每个测试实例输出一个整数x,表示至少需要准备的人民币张数。每个输出占一行。
Sample Input
3
1 2 3
0
Sample Output
4
 */
public class 工资纸币的张数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()) {

            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int[] arr = new int[n];
            int num = 0;
            int sum = 0;

            for (int i = 0; i < n; i++) {

                arr[i] = scanner.nextInt();
                if (arr[i] >= 100) {
                    num = arr[i] / 100;
                    arr[i] = arr[i] - 100 * num;
                    sum += num;
                }
                if (arr[i] >= 50) {
                    num = arr[i] / 50;
                    arr[i] = arr[i] - 50 * num;
                    sum += num;
                }
//                if (arr[i]>=20){
//                    num+=arr[i]/20;
//                    arr[i]=arr[i]-20*num;
//                    sum+=num;
//                }
                if (arr[i] >= 10) {
                    num = arr[i] / 10;
                    arr[i] = arr[i] - 10 * num;
                    sum += num;
                }
                if (arr[i] >= 5) {
                    num = arr[i] / 5;
                    arr[i] = arr[i] - 5 * num;
                    sum += num;
                }
                if (arr[i] >= 2) {
                    num = arr[i] / 2;
                    arr[i] = arr[i] - 2 * num;
                    sum += num;

                }
                if (arr[i] >= 1) {
                    num = arr[i] / 1;
                    sum += num;
                }
            }
            System.out.println(sum);
        }
        //可行的第二种方法,取整取余方法
//        Scanner sc =new  Scanner(System.in);
//        while(sc.hasNext()){
//            int n = sc.nextInt();
//            if(n==0){
//                break;
//            }
//            int t[]={100,50,10,5,2,1};
//            int sum=0;
//            int a;
//            for(int i=0;i<n;i++){
//                a=sc.nextInt();
//                int b=0;
//                for(int j=0;j<t.length;j++){
//                    b=a/t[j]+b;
//                    a=a%t[j];
//                    if(a==0){
//                        break;
//                    }
//                }
//                sum+=b;
//            }
//            System.out.println(sum);
//        }
    }
}