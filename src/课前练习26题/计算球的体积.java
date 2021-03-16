package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/15/18:07
 * @Description:
 **/
public class 计算球的体积 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            double radius;
            radius =scanner.nextDouble();
            System.out.println(String.format("%.3f",((4*3.1415927*Math.pow(radius,3))/3)));
        }
    }
}