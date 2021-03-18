package 课前练习26题;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/15/22:06
 * @Description:
 **/
/*
输入三个字符后，按各字符的ASCII码从小到大的顺序输出这三个字符。
Input
输入数据有多组，每组占一行，有三个字符组成，之间无空格。
Output
对于每组输入数据，输出一行，字符中间用一个空格分开。
Sample Input
qwe
asd
zxc
Sample Output
e q w
a d s
c x z
 */
import java.util.Arrays;
import java.util.Scanner;


public class 三字符ASCII排序 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            String str=scanner.next();
            char[] chars=str.toCharArray();
            for (int i = 0; i <=2 ; i++) {
                chars[i]=str.charAt(i);

            }
            Arrays.sort(chars);
            //System.out.println(Arrays.toString(chars));

            System.out.println(chars[0]+" "+chars[1]+" "+chars[2]);
        }

    }
}