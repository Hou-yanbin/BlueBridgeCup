package 课后习题.Step3数组;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/27/14:53
 * @Description:
 **/
public class 贪吃蛇长度 {
    static int num = 0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=null;

//        str="±------------------------------------------------+\n" +
//                "| |\n" +
//                "| H###### #### |\n" +
//                "| # # # |\n" +
//                "| # # # |\n" +
//                "| # #### # # |\n" +
//                "| # # # # # |\n" +
//                "| ######@### # # |\n" +
//                "| # #### # # |\n" +
//                "| # # # # # |\n" +
//                "| ####@#######@### # # |\n" +
//                "| # # # # # |\n" +
//                "| T ##### # # # ## |\n" +
//                "| # # ### ### ## |\n" +
//                "| ################ # # #### |\n" +
//                "| # # # # |\n" +
//                "| ############## #######@########## |\n" +
//                "| # ### |\n" +
//                "| ########################### |\n" +
//                "±------------------------------------------------+";
        int n=20;//总共20行
        while (n-->0) {
            str = scanner.nextLine();
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '#')
                    num++;
                if (chars[i] == '@')
                    num += 2;
            }
        }System.out.println(num+2);


    }
}