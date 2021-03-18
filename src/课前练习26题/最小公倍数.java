package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/16:54
 * @Description:
 **/
/*
求n个数的最小公倍数。
Input
输入包含多个测试实例，每个测试实例的开始是一个正整数n，然后是n个正整数。
Output
为每组测试数据输出它们的最小公倍数，每个测试实例的输出占一行。你可以假设最后的输出是一个32位的整数。
Sample Input
2 4 6
3 2 5 7
Sample Output
12
70
 */
public class 最小公倍数 {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                while (sc.hasNext()){
                    int n=sc.nextInt();
                    int[] arr=new int[n];
                    int gcd=0,sum=0;
                    for (int i = 0; i <arr.length ; i++) {
                        arr[i]=sc.nextInt();
                    }
                    for (int i = 0; i <arr.length-1 ; i++) {
                        gcd=gcd(arr[i],arr[i+1]);
                        sum=arr[i+1]*=arr[i]/gcd;

                    }
                    System.out.println(sum);


                }
            }

            public static int gcd(int a,int b){
                while (b!=0){
                    int temp=a%b;
                    a=b;
                    b=temp;
                }
                return a;
            }
        }
