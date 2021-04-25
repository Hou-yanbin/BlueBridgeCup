package 天梯赛;

import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/23/10:57
 * @Description:
 **/
public class 个位数统计 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        char arr[]=str.toCharArray();
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int num5=0;
        int num6=0;
        int num7=0;
        int num8=0;
        int num9=0;
        int num0=0;

        for (int i = 0; i <arr.length; i++) {
           if (arr[i]=='0'){
               num0++;
           }
            if (arr[i]=='1'){
                num1++;
            }
            if (arr[i]=='2'){
                num2++;
            }
            if (arr[i]=='3'){
                num3++;
            }
            if (arr[i]=='4'){
                num4++;
            }
            if (arr[i]=='5'){
                num5++;
            }
            if (arr[i]=='6'){
                num6++;
            }
            if (arr[i]=='7'){
                num7++;
            }
            if (arr[i]=='8'){
                num8++;
            }
            if (arr[i]=='9'){
                num9++;
            }

        }
        if (num0!=0) {
            System.out.println("0:" + num0);
        }
        if (num1!=0) {
            System.out.println("1:" + num1);
        }
        if (num2!=0) {
            System.out.println("2:" + num2);
        }
        if (num3!=0) {
            System.out.println("3:" + num3);
        }
        if (num4!=0) {
            System.out.println("4:" + num4);
        }
        if (num5!=0) {
            System.out.println("5:" + num5);
        }
        if (num6!=0) {
            System.out.println("6:" + num6);
        }
        if (num7!=0) {
            System.out.println("7:" + num7);
        }
        if (num8!=0) {
            System.out.println("8:" + num8);
        }
        if (num9!=0) {
            System.out.println("9:" + num9);
        }




    }
}