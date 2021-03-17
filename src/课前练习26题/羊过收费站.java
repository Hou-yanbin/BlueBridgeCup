package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/17:43
 * @Description:
 **/
public class 羊过收费站 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        while (n--!=0){
            int num=scanner.nextInt();
            int sum=3;
            for (int i = 0; i <num ; i++) {
                sum=(sum-1)*2;
            }
            System.out.println(sum);
        }
    }
}