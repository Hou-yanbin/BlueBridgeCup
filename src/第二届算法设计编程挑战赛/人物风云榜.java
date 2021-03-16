package 第二届算法设计编程挑战赛;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/10/18:04
 * @Description:
 **/
public class 人物风云榜 {
    public static void main(String[] args) {

                // TODO Auto-generated method stub
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < a.length; i++)
                {

                    a[i]= sc.nextInt();
                }
                int s=0;
                for (int i = 0; i < a.length; i++)
                {
                    s=1;
                    for(int j=0;j<a.length;j++)
                    {
                        if(a[i]<a[j])
                        {

                            s=s+1;
                        }
                    }
                    System.out.print(s+" ");
                }

            }
        }


//        int count=0;
//        for (int i = 0; i < n; i++) {
//
//            if (arr[0]<arr[i+1]){
//                count++;
//            }
//        }
//        System.out.print("排名:"+count+1+" ");
//        int count1=0;
//        for (int i = 0; i < n; i++) {
//
//            if (arr[1]<arr[i+1]){
//                count1++;
//            }
//        }
//        System.out.print(count1+1+" ");
//        int count2=0;
//        for (int i = 0; i < n; i++) {
//
//            if (arr[2]<arr[i+1]){
//                count2++;
//            }
//        }
//        System.out.print(count2+1+" ");
//        int count3=0;
//        for (int i = 0; i < n; i++) {
//
//            if (arr[3]<arr[i+1]){
//                count3++;
//            }
//        }
//        System.out.print(count3+1+" ");
//        int count4=0;
//        for (int i = 0; i < n; i++) {
//
//            if (arr[4]<arr[i+1]){
//                count4++;
//            }
//        }
//        System.out.print(count4+1+" ");
//

