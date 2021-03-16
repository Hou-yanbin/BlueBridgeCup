package B站练习.递归;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/5/16:20
 * @Description:
 **/
public class 数组求和 {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,5,6,8,3,1,9,3};
        System.out.println(sum(arr1,0));
    }
    static int sum(int[] arr,int begin){
        if (begin==arr.length-1)
            return arr[begin];
        return arr[begin]+(sum(arr,begin+1));

    }
}