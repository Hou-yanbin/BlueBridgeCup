package 天梯赛;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/23/21:19
 * @Description:
 **/
public class 跟奥巴马一起画方块 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String aChar = scanner.next();
        if (num%2==0) {
            for (int i = 1; i <= num / 2 ; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.print(aChar);
                }
                if (i != num / 2)
                    System.out.println();
            }
        }
        if (num%2==1) {
            for (int i = 1; i <= num / 2 + 1; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.print(aChar);
                }
                if (i != num / 2+1)
                    System.out.println();
            }
        }

    }
}