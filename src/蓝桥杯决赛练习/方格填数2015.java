package 蓝桥杯决赛练习;

import java.util.Arrays;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/5/13/21:10
 * @Description:
 **/
public class 方格填数2015 {
    public static int num=0;
    public static int arr[] ={2,3,4,5,6,7,8,9};
    public static void qpl(int k){
        if (k>=arr.length){//如果k>=arr.length就不需要比较了
//            //check();自定义操作
//            System.out.println(Arrays.toString(arr));
            if (arr[0]<arr[1]&&arr[1]<arr[2]&&arr[2]<arr[3]&&arr[4]<arr[5]&arr[5]<arr[6]&&arr[6]<arr[7]
                    &&arr[5]>arr[0]&&arr[6]>arr[1]&&arr[7]>arr[2]){
                System.out.println(Arrays.toString(arr));
                num++;
            }
//            for (int i = 0; i < 3; i++) {
//                if ((arr[i]<arr[i+1]&&arr[i+5]>arr[i]&&arr[i+4]<arr[i+5])!=true){
//                    break;
//                }
//
//            }
//            num++;

        }
        else {
            for (int i = k; i <arr.length ; i++) {//全排列第k项后面的，每一项都来和k这一项比较一下，
                int temp=arr[i];//交换两个数的位置
                arr[i]=arr[k];
                arr[k]=temp;
                qpl(k+1);
                temp=arr[i];//交换元素，返回原来位置//回溯
                arr[i]=arr[k];
                arr[k]=temp;
            }
        }
    }

    public static void main(String[] args) {
        qpl(0);
        System.out.println(num);
    }
}