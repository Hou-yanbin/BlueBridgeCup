package B站练习.递归;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/5/16:33
 * @Description:
 **/
public class 翻转字符串 {
    public static void main(String[] args) {
        String str="Jack hou";
        int index=str.length()-1;

        System.out.println(reverse(str,index));
    }
    static String reverse(String str,int end){
        if (end==0)
            return ""+str.charAt(end);
        return str.charAt(end)+reverse(str,end-1);
    }
}