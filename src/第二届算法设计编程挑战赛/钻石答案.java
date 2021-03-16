package 第二届算法设计编程挑战赛;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/13/18:15
 * @Description:
 **/
public class 钻石答案 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();//钻石数
        Integer m = scanner.nextInt();//购物袋数量

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            int tiji = scanner.nextInt();//钻石体积
            int jiage = scanner.nextInt();//价格
            for (int j = 0; j<1; j++) {
                arr[i][0] = tiji;
                arr[i][1] = jiage;
            }
        }
        //创建购物袋数组
        Integer[] gouwudai=new Integer[m];
        for (int i = 0; i <gouwudai.length ; i++) {
            gouwudai[i]=scanner.nextInt();
        }
        //将购物袋的容量进行降序排列,
        Arrays.sort(gouwudai,new Comparator<Integer>() {  //降序
            public int compare(Integer a, Integer b) {

                return b-a;  //降序（return a-b为升序）
            }
        });
        //将钻石按照价格排序,也就是按照二维数组的第二列进行降序排列
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] t0, int[] t1) {
                return t1[1]-t0[1] ;
            }
        });
        //进行比较和累加求和
        int sum=0;
        for (int i = 0; i <n; i++) {
            //比较购物袋的体积大小和钻石的体积大小
            if (gouwudai[m-1]>=arr[i][0]){
                //累加符合if的钻石的价格
                sum+=arr[i][1];
            }
        }
        //输出最大花销价格
        System.out.println(sum);
    }

}