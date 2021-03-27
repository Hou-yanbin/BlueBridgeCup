package 课后习题.Step3数组;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/27/17:17
 * @Description:
 **/

public class 承压计算2017 {
    public static void main(String[] args) {
        // 录入数组
        Scanner scanner=new Scanner(System.in);
        double[][] arr=new double[30][30];
        for (int i = 0; i < arr.length-1; i++) {//数组长度是30，arr.length（30）-1=29,[0,29）也是29个数
            for (int j = 0; j <=i ; j++) {
                arr[i][j]=scanner.nextDouble();
            }
        }
        for (int i = 0; i < 29; i++) {
            for (int j = 0; j <=i ; j++) {
                double avg=arr[i][j]/2.0;//将第i行j列的的数（重量均分为2）平分成两份
                arr[i+1][j]+=avg;//将上面的平均数各自加到下面的相邻两个的数上
                arr[i+1][j+1]+=avg;

            }
        }
        double minVal=Double.MAX_VALUE;//改值为常数，表示double能够表示的最大的数Double.MIN_VALUE=4.9E-324
        double maxVal=Double.MIN_VALUE;//改值为常数，表示double能够表示的最小的数Double.MAX_VALUE=1.7976931348623157E308
        for (int i = 0; i <30 ; i++) {
            if (arr[29][i]<minVal)
                minVal=arr[29][i];
            if (arr[29][i]>maxVal)
                maxVal=arr[29][i];
        }
        System.out.println((long)((2086458231.0 *maxVal)/minVal));//2086458231是[(重量（小）*单位)*重量（大）]/最小重量（这个可以和前面的重量小相消除）剩下的是重量大*单位(电子秤有单位）电子秤所能展示的示数

    }
}
