package 课后习题.Step4容器;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/4/10:32
 * @Description:
 **/
public class 后缀表达式2017正确 {
    private static StreamTokenizer st=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static void main(String[] args) throws Exception{
        st.nextToken();
        int n=(int)st.nval;
        st.nextToken();
        int m=(int)st.nval;
        int totalNum=n+m+1;

        int negNum=0;
        int posNum=0;
        long absSum=0;
        long noSignSum=0;
        int minPos=Integer.MAX_VALUE;
        int maxNeg=Integer.MIN_VALUE;
        int num;
        for(int i=0;i<totalNum;i++){
            st.nextToken();
            num=(int)st.nval;
            noSignSum+=num;//保存没有负号运算时候所有数的和
            absSum+=Math.abs(num);//保存当负数和负号的数量相等时的绝对值的和
            if(num>=0){
                posNum+=1;
                minPos=Math.min(num,minPos);
            }
            else{
                negNum+=1;
                maxNeg=Math.max(num,maxNeg);
            }
        }

        //判断条件：
       /*
       没有负号运算符：此时将所有数都加了,例如：
       5 0
       1 2 3 -4 -5 -6
       ->  1 2 + 3 + -4 + -5 + -6 +
       ->  -9
        */
        if(m==0)System.out.println(noSignSum);
       /*
       一旦负号存在，负号位置就会对运算结果产生影响，那么：
       1.在无正数并且负号运算符不足参与负数运算的情况下，就
       有一个负数会单独出来和一个其它数求出来的一个绝对值和整体做减运算，负数为被减数。负数取最大值时值最大
       也就是所求的值等于 所有绝对值的值和除去这个负数两次 的值。
       例如：
       2 3
       -1 -2 -3 -4 -5 -6
       ->  -1 ( (-2 -3) + ) - ( (-4 -5) + ) - -6 -
       ->  19

       2.在无负数并且负号运算符大于0，所有正整数参与运算的情况下，就
       有一个正数会单独出来和一个其它数求出来的一个绝对值和整体做减运算，正数为被减数，正数取最小值时值最大
       也就是所求的值等于 所有绝对值的值和除去这个正数两次 的值。
       例如：
       2 3
       1 2 3 4 5 6
       ->   ( 1 2 - ) 3 - )(4 5 + 6 +) -
       ->   19

       3. 正数和负数都在的情况下，并且负号运算存在，那么要使得值最大，值最大应该为绝对值和，因为负负得正。

        */
        else if(posNum==0&&m<negNum)System.out.println(absSum+2*maxNeg);
        else if(negNum==0&&m>negNum)System.out.println(absSum-2*minPos);
        else System.out.println(absSum);
    }
}