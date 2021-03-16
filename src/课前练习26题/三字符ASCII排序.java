package 课前练习26题;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/15/22:06
 * @Description:
 **/
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