package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/22:16
 * @Description:
 **/
public class 最大字母后插入max {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while (scanner.hasNext()){
            StringBuilder str=new StringBuilder(scanner.next());
            char[] chars=new char[999];
            int max=chars[0];
            int k = 0;
            for (int i = 0; i <str.length() ; i++) {
                chars[i]=str.charAt(i);
                if (chars[i]>max){
                    max=chars[i];//max是定义的额外的变量,在int max=chars[0];定义过,并未初始化,,在chars[i]=str.charAt(i)初始化,
                    // 额外变量不影响chars[]数组,知识将chars[i]给了max,而没有给数组
                    k=i;
                }
            }
            for (int i = 0; i <str.length(); i++) {
                System.out.print(str.charAt(i));
                if (chars[k]==chars[i]){
                    System.out.print("(max)");
                }

            }
            System.out.println();
        }
    }
}