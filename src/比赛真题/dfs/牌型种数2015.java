package 比赛真题.dfs;


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
