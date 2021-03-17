package 课前练习26题;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/15:05
 * @Description:
 **/
public class 比赛去最高最低后求平均分 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            double[] arr=new double[n];
            for (int i = 0; i < n; i++) {
                arr[i]=scanner.nextDouble();
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            int sum=0;
            for (int i = 1; i <=arr.length-2 ; i++) {
                sum+=arr[i];
            }
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format((float)sum/(n-2)));
        }
    }
}