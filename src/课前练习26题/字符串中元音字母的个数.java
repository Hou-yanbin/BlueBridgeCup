package 课前练习26题;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/16/10:19
 * @Description:
 **/
import java.util.Scanner;


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