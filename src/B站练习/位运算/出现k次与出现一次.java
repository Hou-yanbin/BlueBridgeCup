package B站练习.位运算;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/5/12:43
 * @Description:K个k进制的数做不进位加法结果为0
 * 先将所有的数转换为k进制的数字，然后做不进位的加法，最后就剩下出现一次的k进制数，然后再将剩下的k进制数转换成十进制数
 **/
public class 出现k次与出现一次 {
        public static void main(String[] args) {
            int[] arr = {2, 2, 2, 9, 7, 7, 7, 3, 3, 3, 6, 6, 6, 0, 0, 0};
            int len = arr.length;
            char[][] kRadix = new char[len][];
            int k = 3;

            int maxLen = 0;
            //转成k进制字符数组
            //对于每个数字
            for (int i = 0; i < len; i++) {
                //求每个数字的三进制字符串并翻转，然后转为字符数组
                kRadix[i] = new StringBuilder(Integer.toString(arr[i], k)).reverse().toString().toCharArray();
                if (kRadix[i].length > maxLen)
                    maxLen = kRadix[i].length;
            }
            //不进位加法
            int[] resArr = new int[maxLen];
            for (int i = 0; i < len; i++) {
                //  不进位加法
                for (int j = 0; j < maxLen; j++) {
                    if (j >= kRadix[i].length)
                        resArr[j] += 0;
                    else
                        resArr[j] += (kRadix[i][j] - '0');
                }
            }

            int res = 0;
            for (int i = 0; i < maxLen; i++) {
                res += (resArr[i] % k) * (int) (Math.pow(k, i));// 8%3=2,
            }
            System.out.println(res);
        }
    }

