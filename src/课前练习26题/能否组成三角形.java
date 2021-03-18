package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/14:54
 * @Description:
 **/
/*
给定三条边，请你判断一下能不能组成一个三角形。
Input
输入数据第一行包含一个数M，接下有M行，每行一个实例，包含三个正数A,B,C。其中A,B,C <1000;
Output
对于每个测试实例，如果三条边长A,B,C能组成三角形的话，输出YES，否则NO。
Sample Input
2
1 2 3
2 2 2
Sample Output
NO
YES
 */
public class 能否组成三角形 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while (scanner.hasNext()){
            double x=scanner.nextDouble();
            double y=scanner.nextDouble();
            double z=scanner.nextDouble();
            if (x+y>z&&y+z>x&&x+z>y){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}