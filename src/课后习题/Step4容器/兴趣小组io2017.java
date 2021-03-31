package 课后习题.Step4容器;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @version v-1.8.0_131.
 * @auther Jack hou  Email:256595662@qq.com
 * @data 2021/3/31/16:33
 * @Description:
 **/

public class 兴趣小组io2017 {
        public static void main(String[] args) {
            int count = 0;
            File a = new File("D:\\蓝桥杯\\src\\课后习题\\Step4容器\\C.txt");
            File a2 = new File("D:\\蓝桥杯\\src\\课后习题\\Step4容器\\A.txt");
            File a3 = new File("D:\\蓝桥杯\\src\\课后习题\\Step4容器\\B.txt");
            List list = new ArrayList<String>();
            List list2 = new ArrayList<String>();
            try {
                InputStreamReader b = new InputStreamReader(new FileInputStream(a));
                BufferedReader br = new BufferedReader(b);
                String str = br.readLine();
                while (str != null) {
                    String[] q = str.split(", ");
                    for (String h : q) {
                        list.add(h);
                    }
                    str = br.readLine();
                }
                //------------------------------------
                InputStreamReader b2 = new InputStreamReader(new FileInputStream(a2));
                BufferedReader br2 = new BufferedReader(b2);
                String str2 = br2.readLine();
                while (str2 != null) {
                    String[] q = str2.split(", ");
                    for (String h : q) {
                        list2.add(h);
                    }
                    str2 = br2.readLine();
                }
                //---------------------------------------
                InputStreamReader b3 = new InputStreamReader(new FileInputStream(a3));
                BufferedReader br3 = new BufferedReader(b3);
                String str3 = br3.readLine();
                while (str3 != null) {
                    String[] q = str3.split(", ");
                    for (String h : q) {
                        if (list2.contains(h) && !list.contains(h))
                            count++;
                        list2.add(h);
                    }
                    str3 = br3.readLine();
                }
                System.out.println(count);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        }
    }

