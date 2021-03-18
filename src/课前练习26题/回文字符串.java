package 课前练习26题;



/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/10:16
 * @Description:
 **/
/*
“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。请写一个程序判断读入的字符串是否是“回文”。
Input
输入包含多个测试实例，输入数据的第一行是一个正整数n,表示测试实例的个数，后面紧跟着是n个字符串。
Output
如果一个字符串是回文串，则输出"yes",否则输出"no".
Sample Input
4
level
abcde
noon
haha
Sample Output
yes
no
yes
no
 */
import java.util.Scanner;
public class 回文字符串 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

//        String[] strings=new String[10000];
//        System.out.println();
        while(n-->0){
//
//            for (int i = 0; i <n; i++) {
//
//                strings[i]=scanner.next();
//
//                char[] chars=new char[10000];
//                for (int j = 0; j <strings[i].length() ; j++) {
//                    chars[j]=strings[i].charAt(j);
//                }
                boolean flag=true;//可以
                String str=scanner.next();
                int len=str.length();
                for (int k = 0; k <len/2 ; k++) {

                    if (str.charAt(k)!=str.charAt(len-1-k)) {
                        flag=false;//不可以
                        break;
                    }

                }
                if (flag){
                    System.out.println("yes");
                }
                else
                    System.out.println("no");

            }
        }
    }
