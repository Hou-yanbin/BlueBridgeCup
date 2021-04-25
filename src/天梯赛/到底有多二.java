package 天梯赛;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/23/21:44
 * @Description:
 **/
public class 到底有多二 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s=scanner.next();
        char sum[]=s.toCharArray();
        double count=0;
        for (int i = 0; i <sum.length; i++) {
            if (sum[i]=='2'){
                count++;
            }
        }
        //Double ans=Double.valueOf(s);

        if (sum[0]=='-'&&sum[sum.length-1]%2!=0){
            double m=sum.length-1;
            System.out.println(String.format("%.2f",((count/m)*1.5*100))+"%");
            return;
        }
        if (sum[0]=='-'&&sum[sum.length-1]%2==0){
            double m=sum.length-1;
            System.out.println(String.format("%.2f",((count/m)*1.5*2*100))+"%");
            return;
        }
        if (sum[sum.length-1]%2==0){
            double m=sum.length;
            System.out.println(String.format("%.2f",(count/m*2*100))+"%");
            return;
        }
        else {
            double m=sum.length;
            System.out.println(String.format("%.2f",(count/m*100))+"%");
            return;
        }

    }
}