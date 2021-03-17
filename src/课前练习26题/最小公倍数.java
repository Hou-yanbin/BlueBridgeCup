package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/16:54
 * @Description:
 **/
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
