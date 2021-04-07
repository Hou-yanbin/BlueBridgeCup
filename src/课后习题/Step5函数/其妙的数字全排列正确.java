package 课后习题.Step5函数;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/5/17:33
 * @Description:
 **/
/*
直接暴力循环找出符合条件的，注意数字长度合起来为10位且0~9个数字各出现一次
 */
public class 其妙的数字全排列正确 {
    public static int arr[] ={0,1,2,3,4,5,6,7,8,9};
    public static boolean check(long x,long y) {//return false;会直接跳出函数
        if ((String.valueOf(x).length() +String.valueOf(y).length())!= 10)//String.valueOf(x)返回 long 参数的字符串表示形式.length返回长度，如果不是9位直接跳出
            return false;
        int count[] = new int[10];
        while (x != 0) {
            count[(int) (x % 10)]++;//将每一个位置加一，如果取余后有重复的元素，则位置将不是1
            x /= 10;
        }
        while (y != 0) {
            count[(int) (y % 10)]++;//将每一个位置加一，如果取余后有重复的元素，则位置将不是1
            y /= 10;
        }
        for (int i = 0; i <count.length ; i++) {//从数字1开始到9，
            if (count[i]!=1)//判断数组的每个位置是不是1（出现1次）
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i =11; i < 1000; i++) {
            if (check(i*i,i*i*i)){
                System.out.println(i);
            }
        }
    }
}