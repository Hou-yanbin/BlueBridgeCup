package 课后习题.Step3数组;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/23/19:19
 * @Description:横向循环排列
 **/
/*
约瑟夫环（约瑟夫问题）是一个数学的应用问题：已知 n 个人（以编号1，2，3…n分别表示）围坐在一张圆桌周围。
从编号为 k 的人开始报数，数到 m 的那个人出圈；他的下一个人又从 1 开始报数，数到 m 的那个人又出圈；
依此规律重复下去，直到剩余最后一个胜利者
当7人剔除3号时，最终胜利者为4
10人剔除3号，也是4号胜利
 */
public class 约瑟夫环 {
    public static void main(String[] args) {
        int n=7,m=3;
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=i+1;//将每一个位置上的人赋值
        }

        int out=0,cut=0;//out踢出去的人数，cut
        for (int i = 0; out!=n; i++) {//out!=n说明out踢出去的人还没全踢完
            //取余操作使其永远维持在0到(n-1)之间
            if (arr[i%n]==0){//循环取余每次取余都是在0到(n-1)之间，构成循环，arr[0到（n-1）]循环中有元素等于了0，则继续
                continue;//此时此座位的人已经被剔除，则跳出本轮循环，进行下一轮循环
            }
            cut++;
            if (cut==m){//如果cut随着此for循环的累加等于m，则剔出此时的元素（输出)，将这个元素赋值为0
                System.out.println(arr[i%n]);
                arr[i%n]=0;
                out++;//此时out剔除的人数加1
                cut=0;//且将cut重置归零
            }
        }
    }
}