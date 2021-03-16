package 课前练习26题;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/15/16:15
 * @Description:
 **/
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