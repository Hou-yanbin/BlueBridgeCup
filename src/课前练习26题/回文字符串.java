package 课前练习26题;



/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/17/10:16
 * @Description:
 **/
import java.util.Scanner;
public class 回文字符串 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        String[] strings=new String[10000];
        System.out.println();
        while(n-->0){

            for (int i = 0; i <n; i++) {

                strings[i]=scanner.next();

                char[] chars=new char[10000];
                for (int j = 0; j <strings[i].length() ; j++) {
                    chars[j]=strings[i].charAt(j);
                }
                int flag=1;
                for (int k = 0; k <strings[i].length()/2 ; k++) {

                    if (chars[k]!=chars[strings[i].length()-1-k]) {
                        flag=0;
                        break;
                    }

                }
                if (flag==1){
                    System.out.println("yes");
                }
                else
                    System.out.println("no");

            }
        }
    }
}