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
/*
青年歌手大奖赛中，评委会给参赛选手打分。选手得分规则为去掉一个最高分和一个最低分，然后计算平均得分，请编程输出某选手的得分。
Input
输入数据有多组，每组占一行，每行的第一个数是n(2<n<=100)，表示评委的人数，然后是n个评委的打分。
Output
对于每组输入数据，输出选手的得分，结果保留2位小数，每组输出占一行。
Sample Input
3 99 98 97
4 100 99 98 97
Sample Output
98.00
98.50
 */
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