package 蓝桥杯决赛练习;

import java.util.ArrayList;
import java.util.HashSet;

public class 不同字串2019 {
public static void main(String[] args) {
	String string="0100110001010001";
	HashSet<String> ans=new HashSet<String>();
	for (int i = 0; i < string.length(); i++) {
		ans.add(string.substring(i));
		for (int j = i+1; j < string.length(); j++) {
			ans.add(string.substring(i,j));
		}
		
	}
	System.out.println(ans.size());
//	ArrayList<Integer>[] a=new ArrayList[1000];
//	ArrayList<Int[]> b=new ArrayList<Int[]>()



}
}
