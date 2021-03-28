package 课后习题.Step4容器;

import java.util.HashSet;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/28/10:21
 * @Description:
 **/
/*
题目描述
一个字符串的非空子串是指字符串中长度至少为1 的连续的一段字符组成的串。
例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共7 个。
注意在计算时，只算本质不同的串的个数。
请问，字符串0100110001010001 有多少个不同的非空子串？
 */
public class 不同子串2019 {
    public static void main(String[] args) {
        String str="0100110001010001";
        HashSet<String> ans=new HashSet<String>();//声明HashSet<String>能够自动去重
        for (int i = 0; i < str.length(); i++) {
            ans.add(str.substring(i));//add()方法将substring(i)加入到ans
            for (int j = i+1; j <str.length(); j++) {
                ans.add(str.substring(i,j));//add()方法将substring(i，j){[i,j)前取后不取}加入到上一步ans的后面
            }
        }
        System.out.println(ans);
        System.out.println(ans.size());//ans的大小(种类)
    }
}