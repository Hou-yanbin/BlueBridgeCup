package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/22:16
 * @Description:
 **/
/*
对于输入的每个字符串，查找其中的最大字母，在该字母后面插入字符串“(max)”。
Input
输入数据包括多个测试实例，每个实例由一行长度不超过100的字符串组成，字符串仅由大小写字母构成。
Output
对于每个测试实例输出一行字符串，输出的结果是插入字符串“(max)”后的结果，如果存在多个最大的字母，就在每一个最大字母后面都插入"(max)"。
Sample Input
abcdefgfedcba
xxxxx
Sample Output
abcdefg(max)fedcba
x(max)x(max)x(max)x(max)x(max)
 */
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