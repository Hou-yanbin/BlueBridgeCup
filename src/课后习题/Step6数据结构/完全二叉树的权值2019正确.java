package 课后习题.Step6数据结构;
import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/8/13:26
 * @Description:
 **/
public class 完全二叉树的权值2019正确 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int[] array=new int[100005];
            for (int i = 0; i < n; i++) {
                array[i]=sc.nextInt();
            }
            long depth=1,max=Integer.MIN_VALUE;
            int k=0;//k放外面少计算一次每层开始的下标
            for (int i = 1; i <=Math.log(n+1)/Math.log(2) ; i++) {
                long sum=0;
                for(int j=0;j<Math.pow(2, i-1);j++)
                    sum+=array[k++];
                if(sum>max)
                {
                    max=sum;
                    depth=i;
                }
            }
            System.out.println(depth);
            return;
        }

}