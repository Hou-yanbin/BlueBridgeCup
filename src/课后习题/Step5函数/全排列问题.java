package 课后习题.Step5函数;

import java.util.Arrays;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/4/8:28
 * @Description:
 **/
public class 全排列问题 {
    public static int arr[] ={1,2,3,4,5,6};
    public static void qpl(int k){
        if (k>=arr.length){//如果k>=arr.length就不需要比较了
        	//check();自定义操作
            System.out.println(Arrays.toString(arr));
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
        qpl(0);//下标为0的位置不要动，定住，让别的元素动

    }
}