package 蓝桥杯决赛练习;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/5/26/20:23
 * @Description:
 **/
/*
把 1~9 这9个数字分成两组，中间插入乘号，
有的时候，它们的乘积也只包含1~9这9个数字，而且每个数字只出现1次。

比如：
984672 * 351 = 345619872
98751 * 3462 = 341875962
9 * 87146325 = 784316925
...

符合这种规律的算式还有很多，请你计算在所有这些算式中，乘积最大是多少？
 */
public class 最大乘积2018 {
    public static int arr[] = {1,2,3,4,5,6,7,8,9};
    int num=0;
    public static long check(int a,int b) {
        long[] count = new long[9];
        int ans = a * b;
        while (ans != 0) {

            count[ans % 10] = 1;
            ans /= 10;

        }
        for (int i = 0; i < 9; i++) {
            if (count[i]!=1){
                break;
            }
        }
        return ans;
    }
    public static void qpl(int k){
        int a=0;
        int b=0;
        if (k>=arr.length){//如果k>=arr.length就不需要比较了
            int i=1;
            while (i>8){
                for (int j = 1; j <= i; j++) {
                    a=arr[0];
                    a*=10;
                    a+=arr[j];

                }
                for (int l = i+1; l <=8; l++) {
                    b=arr[i+1];
                    b*=10;
                    if (l!=8){
                        b+=arr[l];
                    }else
                        break;

                }

            }
            System.out.println(check(a,b));


          //  System.out.println(Arrays.toString(arr));
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