package 课程练习;

import java.util.Arrays;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/18/18:44
 * @Description:
 **/
public class 字符串函数测试 {
    public static void main(String[] args) {
//        String s="asdfghjkl";
//        String s1="asd";
//        String s2="jklffd";
//        System.out.println(s.replace(s1,s2));
//        String string="ahsduashdias";
//        int arr[]={1,5,2,8,3,2,45,4,};
//        System.out.println(string.length());
//        System.out.println(arr.length);
        int[][] arr=new int[11][11];
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <= 10; j++) {
                arr[i][j] = j;

            }
        }
        for (int i = 1; i <=10 ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        //System.out.println(Arrays.deepToString(arr));



    }
}