package B站练习.递归;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/6/19:57
 * @Description:
 **/
public class 在有空字符的串中的有序字符串数组中查找 {
    public static void main(String[] args) {
        String[] arr = {"a","","ac","","ad","af","b","","ba"};
        int res = indexOf(arr, "ba");
        System.out.println(res);
//        int ex=1;
//        System.out.println(ex<<=1);//ex左移一位
    }
    private static int indexOf(String[] strings,String p){
        int begin=0;
        int end=strings.length-1;
        while (begin<=end) {
            int indexOfMid = begin + ((end - begin) >> 1); //二分
            while (strings[indexOfMid].equals("")) {
                indexOfMid++;
                if (indexOfMid > end)
                    return -1;
            }
            if (strings[indexOfMid].compareTo(p) > 0) {
                end = indexOfMid - 1;
            } else if (strings[indexOfMid].compareTo(p) < 0) {
                begin = indexOfMid + 1;
            } else {
                return indexOfMid;
            }
        }
         return -1;

        }
    }
