/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/4/2/20:40
 * @Description:
 **/
public class 程序运行时间 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();   //获取开始时间
        //doSomeThing();  //测试的代码段
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");//计算时间ms
    }
}