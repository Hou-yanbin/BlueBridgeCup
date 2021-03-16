package LeetCode;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/13/7:40
 * @Description:
 **/
public class 种花问题605 {
    public static void main(String[] args) {

//    class Solution{
//        public boolean canPlaceFlowers(int[] flowerbed,int n){
//            int count=0;
//            for (int i = 0; i < flowerbed.length; i++) {
//                if (flowerbed[i]==0){
//                    count++;
//                }
//            }
//                if ((count/2)>n)
//                    return true;
//                else
//                    return false;
//
//        }
        class Solution {
            public boolean canPlaceFlowers(int[] flowerbed, int n) {

                for (int i = 0; i < flowerbed.length && n > 0; ) {
                    if (flowerbed[i] == 1) {
                        //即如果，当前i位置已经种植了话，那么下一个可以种花的位置是 i+2
                        i += 2;
                    }
                    //如果为最后数组的一位则,必定是有上上位加2或上上上位加3跳过来的,,又因在最后一位,所以此时必定可种花
                    else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                        n--;
                        i += 2;
                    } else if (flowerbed[i + 1] == 1) {
                        i += 3;
                    }

                }
                if (n <= 0)
                    return true;
                else
                    return false;
            }

        }
    }}