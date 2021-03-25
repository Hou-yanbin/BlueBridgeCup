package 课后习题.Step3数组;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/25/15:02
 * @Description:
 **/
public class 修改数组 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];//系统给的数组
        int ans[]=new int[n];//需要找的数组
        int cnt[]=new int[1000000];//中间用cnt进行计值，谁出现了几次
        for (int i = 0; i <n ; i++) {
            arr[i]=scanner.nextInt();
            ans[i]=arr[i]+ cnt[arr[i]];//arr[i]加上代表arr[i]出现的次数的cut[i]
            cnt[arr[i]]++;//将cnt进行计数加一

        }
        boolean buf[]=new boolean[2000000];
        for (int i = 0; i <ans.length; i++) {//标记1,1,1,2,2,2变成1,2,3,2（这个2会与前面加上的那个相同也需要加一），2
            while (buf[ans[i]]){//ans[i]之前没出现过则为false，不会进入while循环，若出现过则ans[i]加一，每当出现过则ans[i]就加一
                ans[i]++;

            }
            buf[ans[i]]=true;
        }
        StringBuilder sb=new StringBuilder();//用StringBuilder存放要输出的数组及格式
        for (int i = 0; i <ans.length ; i++) {
            sb.append((i==0?"":" ")+ans[i]);//实现arr[i]+" "+arr[i+1]
        }
        System.out.println(sb.toString());
    }
}