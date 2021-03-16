package LeetCode;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/13/7:51
 * @Description:
 **/
public class 种花问题605解析 {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
//            int begin=-1;
//            for(int i=0;i<flowerbed.length;i++) {
//                if(flowerbed[i]==1) {
//                    n-=(i-begin-1)/2;
//                    begin=i+1;
//                }
//            }
//            n-=(flowerbed.length-begin)/2;
//            return n<=0;
//        }
            // 如果花种完了，或者花床检查完了，都停止遍历
            for (int i = 0, len = flowerbed.length; i < len && n > 0;) {
                if (flowerbed[i] == 1) {
                    //即如果，当前i位置已经种植了话，那么下一个可以种花的位置是 i+2
                    i += 2;
                } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    //这里很关键
                    //如果是最后一个位置了，那么肯定能够种植（i==flowerbed.length-1)
                    //如果不是，则还需要确保 可种花的位置(i+2)紧邻其后的(i+2+1)的位置没有种植（flowerbed[i+1]==0)
                    //只有这样才可以种植
                    n--;
                    //同时找出下一个可以种植的位置
                    i += 2;
                } else {
                    //这种情况是flowerbed[i+2+1]=1，所以下次循环就从这里重新开始判断其后可种植的位置
                    i += 3;
                }
            }
            return n <= 0;
    }
}