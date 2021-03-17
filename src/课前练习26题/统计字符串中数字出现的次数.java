package 课前练习26题;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/21:37
 * @Description:
 **/
public class 统计字符串中数字出现的次数 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while (n-->0){
            String str=scanner.next();
            char[] chars=new char[str.length()];
            int count=0;
            for (int i = 0; i <str.length(); i++) {
                chars[i]=str.charAt(i);
                if (chars[i]=='1'||chars[i]=='2'||chars[i]=='3'||chars[i]=='4'||chars[i]=='5'||chars[i]=='6'||chars[i]=='7'||chars[i]=='8'||chars[i]=='9'||chars[i]=='0'){
                    count++;
                }

            }System.out.println(count);

        }

    }
}