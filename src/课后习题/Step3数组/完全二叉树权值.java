package 课后习题.Step3数组;
import java.util.Scanner;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/27/14:42
 * @Description:
 **/
/*
题目描述
给定一棵包含N 个节点的完全二叉树，树上每个节点都有一个权值，按从
上到下、从左到右的顺序依次是A1, A2, AN，如下图所示：

现在小明要把相同深度的节点的权值加在一起，他想知道哪个深度的节点
权值之和最大？如果有多个深度的权值和同为最大，请你输出其中最小的深度。
注：根的深度是1。

我做题时候的误区，是当成了满二叉树来算了，忘了判断最后一层深度是否读取结束。本题是完全二叉树。
另外，节点权值有可能为负数，故max初始值不能设置为0，应为data[0]
 */
public class 完全二叉树权值 {
        static Scanner in = new Scanner(System.in);
        static int n;
        static long[] a = new long[100009];
        static long[] sum = new long[100009];
        static int minDepth = Integer.MAX_VALUE;
        static long maxSum = Integer.MIN_VALUE;
        static boolean flag;//标志

        public static void main(String[] args) {
            n = in.nextInt();
            for (int i = 1; i <= n; ++i)
                a[i] = in.nextLong() + a[i - 1];

            for (int i = 1; i <= 100009; ++i) {
                int l = (int) Math.pow(2, i - 1);
                int r = (int) Math.pow(2, i) - 1;
                if (n <= r) {
                    r = n;
                    flag = true;
                }

                sum[i] = a[r] - a[l - 1];

                if (sum[i] > maxSum) {
                    maxSum = sum[i];
                    minDepth = i;
                }
                if (flag)
                    break;
            }
            System.out.println(minDepth);
        }
    }
