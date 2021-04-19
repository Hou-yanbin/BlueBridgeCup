package 比赛真题.dfs;


/*
 * 小明被劫持到X赌城，被迫与其他3人玩牌。
一副扑克牌（去掉大小王牌，共52张），均匀发给4个人，每个人13张。
这时，小明脑子里突然冒出一个问题：
如果不考虑花色，只考虑点数，也不考虑自己得到的牌的先后顺序，自己手里能拿到的初始牌型组合一共有多少种呢？

请填写该整数，不要填写任何多余的内容或说明文字。
 */
public class 牌型种数2015 {
	public static long ans=0;
	public static void dfs(int cha,int k) {//
		if (cha==0) {//
			ans++;
		    return;
		}
		if (cha<0||k>=14) {//剪枝，筛选cha（13张牌）小于0或k(A，2,3...JQK牌的种类)大于等于14，结束
			return;
		}else {
			for (int i = 0; i <5; i++) {
				dfs(cha-i, k+1);//叉树结构， 
			}
		}
	}
public static void main(String[] args) {
	dfs(13,1);
	System.out.println(ans);
}
}
