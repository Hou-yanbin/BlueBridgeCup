package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/13/10:03
 * @Description:
 **/
public class 根据身高重建队列406 {
    public int[][] reconstructQueue(int[][] people) {
        //o1,o2分别代表数组中需要排序比较的两个对象
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        //引入链表（Linked list）是一种常见的基础数据结构，是一种线性表，但是并不会按线性的顺序存储数据，而是在每一个节点里存到下一个节点的地址。
        LinkedList<int[]> list=new LinkedList<>();
        //使用 for-each 来迭代元素：
        for(int[] i : people){
            list.add(i[1],i);
        }
        return list.toArray(new int[list.size()][2]);
    }
}