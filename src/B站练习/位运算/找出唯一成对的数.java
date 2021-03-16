package B站练习.位运算;

import java.util.Arrays;
import java.util.Random;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/3/19:28
 * @Description:
 **/
public class 找出唯一成对的数 {

    public static void main(String[] args) {
        int N=1001;
        int[] arr=new int[N];
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i]=i+1;
        }

        //最后一个数是随机数
        //int index =(int)(Math.random()*10)+1;//和下面的都是[0,11),也就是[0,10]
        arr[arr.length-1] =new Random().nextInt(N-1)+1;//Random().nextInt()会产生从0到n的随机数
        int index=new Random().nextInt(N);
        //swap(arr, index,arr.length-1);
//        for (int i = 0; i <N; i++) {
//            System.out.print(arr[i]+"  ");
//        }
        System.out.println(Arrays.toString(arr));//打印数组
        int sum1=0;
        for (int i = 0; i <=arr.length -1; i++) {
            sum1+=arr[i];
        }
        System.out.println(sum1);
        int sum=0;
        for (int i = 1; i <=arr.length-1; i++) {

            sum+=i;

        }
        System.out.println(sum);
        System.out.println(sum1-sum);
    }

//    public static void swap(int[] arr, int a,int b) {
//
//       int temp=a;
//        a=b;
//        b=temp;
//
//    }

}
