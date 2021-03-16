package B站练习.递归;

import java.util.Arrays;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/6/10:07
 * @Description:
 **/
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr =new int[]{1,5,3,8,2,7,6};
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=0;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            //System.out.print(arr[i]+" ");
        }
        System.out.println(Arrays.toString(arr));

    }
}