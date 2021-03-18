package 课前练习26题;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/15/16:15
 * @Description:
 **/
/*
输入两点坐标（X1,Y1）,（X2,Y2）,计算并输出两点间的距离。
Input
输入数据有多组，每组占一行，由4个实数组成，分别表示x1,y1,x2,y2,数据之间用空格隔开。
Output
对于每组输入数据，输出一行，结果保留两位小数。
Sample Input
0 0 0 1
0 1 1 0
Sample Output
1.00
1.41
 */
import java.util.Scanner;


public class 两点距离 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double x=0,x1=0,y=0,y1=0;
        while (scanner.hasNext()){
            x=scanner.nextDouble();
            y=scanner.nextDouble();
            x1=scanner.nextDouble();
            y1=scanner.nextDouble();
            //Math.sqrt返回一个数的平方根，Math.pow返回一个数的平方
            double sum=0;
            //System.out.println(Math.sqrt(Math.pow((x-x1),2)));
            sum=Math.sqrt(Math.pow((x-x1), 2) + Math.pow((y-y1), 2)) ;
            System.out.println(String.format("%.2f",sum));
        }
        }

}