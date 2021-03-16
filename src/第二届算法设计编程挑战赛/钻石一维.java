package 第二届算法设计编程挑战赛;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/13/16:53
 * @Description:
 **/

public class 钻石一维{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();//钻石的个数
        int m=scanner.nextInt();//购物带的个数
        Integer[] zs=new Integer[n];//钻石大小列
        Integer[] jg=new Integer[n];//钻石价格列
        for(int i=0;i<zs.length;i++)
        {
            zs[i]=scanner.nextInt();
            jg[i]=scanner.nextInt();
        }
        Integer [] gouwudaidaxiao=new Integer[m];
        for (int i = 0; i <gouwudaidaxiao.length ; i++) {
            scanner.nextInt();
        }
        //Arrays.sort(zs);
         Arrays.sort(gouwudaidaxiao,new Comparator<Integer>() {  //降序
                    public int compare(Integer a, Integer b) {

                        return b-a;  //降序（return a-b为升序）
                    }
                });
        Arrays.sort(jg,new Comparator<Integer>() {  //降序
            public int compare(Integer a, Integer b) {

                return a-b;  //升序（return a-b为升序）
            }
        });


        //从低到高排序
//        for(int i=0;i<n;i++)  //输出
//        {
//            System.out.print(jg[i]+" ");
//        }


    }
    }



