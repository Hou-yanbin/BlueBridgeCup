package 课后习题.Step5函数;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/7/18:50
 * @Description:
 **/
public class 搭积木2016 {
    public static int arr[]={0,1,2,3,4,5,6,7,8,9};
    public static int count=0;
    public static boolean check(int[] x) {
        if (x[0] != 0)
            return false;
        if (x[1] > x[3] && x[1] > x[4] && x[2] > x[4] && x[2] > x[5] && x[3] > x[6] && x[3] > x[7] && x[4] > x[7] && x[4] > x[8] && x[5] > x[8] && x[5] > x[9]) {
            count++;
            return true;
        }
        return false;
    }
    public static void qpl(int k){
        if (k>=arr.length){
            check(arr);

            //System.out.println(Arrays.toString(arr));
        }
        else {
            for (int i = k; i <arr.length ; i++) {
                int temp=arr[i];//交换两个数的位置
                arr[i]=arr[k];
                arr[k]=temp;
                qpl(k+1);
                temp=arr[i];//交换元素，返回原来位置
                arr[i]=arr[k];
                arr[k]=temp;
            }
        }
    }

    public static void main(String[] args) {
        qpl(0);
        System.out.println(count);
    }

}