package 比赛真题.比赛真题2019;


import java.util.HashSet;

public class 不同字串 {
		public static void main(String[] args) {
			String str="0100110001010001";
			HashSet<String> ans=new HashSet<String>();
			for (int i = 0; i < str.length(); i++) {
				ans.add(str.substring(i));//返回一个新的字符串，它是此字符串的一个子字符串。该子字符串从指定索引处的字符开始，直到此字符串末尾。
				for (int j = i+1; j < str.length(); j++) {
					ans.add(str.substring(i,j));//返回一个新字符串，它是此字符串的一个子字符串。该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。因此，该子字符串的长度为 endIndex-beginIndex。
			
				}
			}
			System.out.println(ans.size());
			
		}
}
