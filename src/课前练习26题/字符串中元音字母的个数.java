package 课前练习26题;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/16/10:19
 * @Description:
 **/
import java.util.Scanner;
/*
统计每个元音字母在字符串中出现的次数。
Input
输入数据首先包括一个整数n，表示测试实例的个数，然后是n行长度不超过100的字符串。
Output
对于每个测试实例输出5行，格式如下：
a:num1
e:num2
i:num3
o:num4
u:num5
多个测试实例之间由一个空行隔开。

请特别注意：最后一块输出后面没有空行：）
Sample Input
2
aeiou
my name is ignatius
Sample Output
a:1
e:1
i:1
o:1
u:1

a:2
e:1
i:3
o:0
u:1
 */

public class 字符串中元音字母的个数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        char[] chars=new char[100];



        while (scanner.hasNext()){
            String str=null;
            String[] strings=new String[n];
            for (int i = 0; i <n; i++) {
                strings[i]=scanner.nextLine();
            }
            //System.out.println();
           // System.out.println(strings[0].length());
            for (int j = 0; j < n; j++) {
                for (int i = 0; i <strings[j].length() ; i++) {

                }
            }
            for (int j = 0; j < n; j++) {
                int aCount=0;
                int eCount=0;
                int iCount=0;
                int oCount=0;
                int uCount=0;
                for (int i = 0; i <strings[j].length(); i++) {
                    chars[i]=strings[j].charAt(i);
                    if (chars[i]=='a'){
                        aCount++;
                    }
                    if (chars[i]=='e'){
                        eCount++;
                    }
                    if (chars[i]=='i'){
                        iCount++;
                    }
                    if (chars[i]=='o'){
                        oCount++;
                    }
                    if (chars[i]=='u'){
                        uCount++;
                    }
                }
                System.out.println("a:"+aCount);
                System.out.println("e:"+eCount);
                System.out.println("i:"+iCount);
                System.out.println("o:"+oCount);
                System.out.println("u:"+uCount);
                if (j<n-1)
                    System.out.println();
            }
        }
    }
}