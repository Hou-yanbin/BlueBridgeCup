package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/14:39
 * @Description:
 **/
public class 猴子吃桃 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
           int n=scanner.nextInt();
           int sum=1;

            for (int i = 2; i <=n; i++) {
                sum=(sum*2+2);
            }
            System.out.println(sum);
        }
}
}