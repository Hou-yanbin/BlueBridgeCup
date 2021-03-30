package 课后习题.Step4容器;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/28/20:11
 * @Description:
 **/
public class 人物相关性分析2019 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        scanner.nextLine();
        String s=scanner.nextLine();
        char c[]=s.toCharArray();
        ArrayList<Integer> Al=new ArrayList<Integer>();//记录Alice出现的次数
        ArrayList<Integer> Bo=new ArrayList<Integer>();//记录Bob出现的次数
        for (int i = 0; i <c.length ; i++) {
            if ((i-1<0||c[i-1]=='.'||c[i-1]==' ')&&c[i]=='A'&&c[i+1]=='l'&&c[i+2]=='i'&&c[i+3]=='c'&&c[i+4]=='e'&&(c[i+5]=='.'||c[i+5]==' ')){
                Al.add(i);
            }
        }
        for (int i = 0; i <c.length ; i++) {
            if ((i-1<0||c[i-1]=='.'||c[i-1]==' ')&&c[i]=='B'&&c[i+1]=='o'&&c[i+2]=='b'&&(c[i+3]=='.'&&c[i+3]=='.')){
                Bo.add(i);
            }
        }
        long ans=0;
        int CF[]=new int[1000009];
        int QZH[]=new int[1000005];
        for (int t : Al) {//把Alice的每一个t的位置提取出来
            CF[Math.max(0,t-k-3)]++;//-3是因为Alice Bob，减去的Bob//区间左端点加1，区间右端点减1，可以实现这个区间的加法
            CF[Math.min(1000000,t+k+5)]--;
        }
        QZH[0]=CF[0];
        for (int i = 1; i <1000005 ; i++) {
            QZH[i]=QZH[i-1]+CF[i];//将差分转化为前缀和
        }
        for (int t:Bo){
            ans+=QZH[t];
        }
        System.out.println(ans);
    }
}
