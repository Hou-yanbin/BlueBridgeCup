package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/14:54
 * @Description:
 **/
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