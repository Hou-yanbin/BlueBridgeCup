package 课后习题.Step4容器;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/28/16:42
 * @Description:
 **/
/*
题目描述
“饱了么”外卖系统中维护着N 家外卖店，编号1~N。
每家外卖店都有一个优先级，初始时(0 时刻) 优先级都为0。
每经过1 个时间单位，如果外卖店没有订单，则优先级会减少1，最低减到0；
而如果外卖店有订单，则优先级不减反加，每有一单优先级加2。
如果某家外卖店某时刻优先级大于5，则会被系统加入优先缓存中；
如果优先级小于等于3，则会被清除出优先缓存。
给定T 时刻以内的M 条订单信息，请你计算T 时刻时有多少外卖店在优先缓存中。
输入
第一行包含3 个整数N、M 和T。
以下M 行每行包含两个整数ts 和id，表示ts 时刻编号id 的外卖店收到一个订单
1<=N, M, T<=100000，1<=ts<=T，1<=id<=N。

输出
输出一个整数代表答案。
样例输入 Copy
2 6 6
1 1
5 2    //ts=5的时间，2号店有一个订单
3 1
6 2
2 1
6 2
样例输出 Copy
1
 */
public class 便利店优先级2019 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();//n家店
            int m=scanner.nextInt();//m条订单
            int t=scanner.nextInt();//t时刻
            int pro[]=new int[n+1];//优先级
            int last[]=new int[n+1];//最后一个卖给谁了
            HashMap<Integer,Integer> arr[]=new HashMap[t+1];//把0空出来，弄成t+1个，下标是0-t，长度是
            for (int i = 0; i <=t ; i++) {
                arr[i]=new HashMap<Integer, Integer>();
            }
            int ts,id;
            for (int i = 0; i <m ; i++) {
                ts=scanner.nextInt();//时间
                id=scanner.nextInt();//店铺名
                //ts的时间装进去一个id和arr[ts]，getOrDefault() 方法获取指定 key 对应对 value，如果找不到 key ，则返回（设置的默认值0）。
                arr[ts].put(id,arr[ts].getOrDefault(id,0)+1);//初始为0，

            }
            HashSet<Integer> ans=new HashSet<Integer>();//答案数组
            for (int i = 0; i <= t; i++) {//遍历t时间段内
                for (int x:arr[i].keySet()) {//把每个key值取出来(店铺名)，
                    //pro[x]-【(i-last[x]-1)当前的位置-最后一次卖出去东西的时间-1】(这么个时间段没有卖出去东西，每一个时间段-1，所以直接减去这个时间段就可以)，
                    pro[x]=Math.max(0,pro[x]-(i-last[x]-1));//Math.max(0,pro[x]-(i-last[x]-1))因为后面的pro[x]-(i-last[x]-1)可能为负数(-1是因为此时卖出去了)，所以max函数取最大(不能低于0)
                    if (pro[x]<=3&&ans.contains(x))ans.remove(x);//优先级小于3，将x从pro中踢出来
                    pro[x]+=arr[i].get(x)*2;//获取arr[i].get(x)这个店铺今天卖了多少单，在*2就是今日的优先级
                    //Java的API文档指出: 当且仅当 本set包含一个元素 e，并且满足(o==null ? e==null : o.equals(e))条件时,contains()方法才返回true. 因此 contains()方法 必定使用equals方法来检查是否相等.
                    if (pro[x]>5&&!ans.contains(x))ans.add(x);//优先级大于5且没在pro的队列中，则将x加入到优先级队列pro中
                    last[x]=i;//更新x店铺卖出东西的最后一个时间就是i
                }
            }
            for (int i = 1; i <=n ; i++) {
                if (last[i]!=t){
                    pro[i]=Math.max(0,pro[i]-(t-last[i]));//如果不是最后一个时间，则需要减去优先级(不-1是因为t时刻没有卖出去)
                    if (pro[i]<=3&&ans.contains(i))ans.remove(i);
                }
            }
            System.out.println(ans.size());
        }
    }
}