package 课后习题.Step5函数;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/4/8:55
 * @Description:
 **/
public class 九数算式2017 {
    public static int arr[] ={1,2,3,4,5,6,7,8,9};
    public static int ans=0;
    public static long toint(int b,int e){
        long res=0;
        for (int i = b; i <= e; i++) {
            res*=10;//乘10后加加上下一位，将上面单个数列数字组成多个数字（如：1,2,3，组成123）
            res+=arr[i];
        }
        return res;
    }
    public static boolean check(long x) {//return false;会直接跳出函数
        if (String.valueOf(x).length() != 9)//String.valueOf(x)返回 long 参数的字符串表示形式.length返回长度，如果不是9位直接跳出
            return false;
        int count[] = new int[10];
        while (x != 0) {
            count[(int) (x % 10)]++;//将每一个位置加一，如果取余后有重复的元素，则位置将不是1
            x /= 10;
        }
        for (int i = 1; i <count.length ; i++) {//从数字1开始到9，
            if (count[i]!=1)//判断数组的每个位置是不是1（出现1次）
                return false;
        }
        return true;

    }
    public static void qpl(int k){
        if (k>=arr.length){//如果k>=arr.length就不需要比较了
            for (int i = 0; i <arr.length-1; i++) {
                long a = toint(0, i);
                long b = toint(i + 1, arr.length - 1);
                if (check(a * b))
                    ans++;
            }
        }
        else {
            for (int i = k; i <arr.length ; i++) {//全排列第k项后面的，每一项都来和k这一项比较一下，
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
        qpl(0);//下标为0的位置不要动，定住，让别的元素动
        System.out.println(ans/2);
    }
}
