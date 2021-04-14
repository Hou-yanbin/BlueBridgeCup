package 课后习题.Step6数据结构;

/*
 * 思路分析：一共有8种不同的数字，现用字母表示为a~h，每个字母用0~9中的某个数字去填充，明显，这里有两个字母是不可以为0的，
 * 这可以作为优化的一个条件。这里运用回溯算法的思想，一共需要填充8个数字，可以设一个长度为8的整形数组a，设需要输出的为a[0]~a[3]。
 * 从a[0]开始依次填充，每次符合条件继续填充下一个。代码如下：

 */
public class 三羊献瑞2015全排列 {

	public static void main(String[] args) {
		int a[]=new int[8];//定义一个长度为8的数组
		for (int i = 0; i < a.length; i++) {
			a[i]=0;
		}
			fun(a,0);
	}
	public static void fun(int a[],int n){
		if(n==8){
			if(check_sum(a)){
			
			System.out.println(a[0]+""+a[1]+""+a[2]+""+a[3]);
			return;
			}
		}else{
			for(int i=0;i<10;i++){
				a[n]=i;
				if(check(a,n)) fun(a,n+1);
			}
		}
	}
	public static boolean check(int a[],int n){
		boolean flag=true;
		if(n==0){
			if(a[n]==0) flag=false;
		}else{
			
			for(int i=0;i<n;i++){
				if(a[i]==a[n]){
					flag=false;
					break;
				}
			}
			if(n==4 && a[n]==0) flag=false;
				
			
		}
		return flag;
	}
	public static boolean check_sum(int a[]){
		int x=1000*a[4]+100*a[3]+10*a[5]+a[6];
		int y=1000*a[0]+100*a[1]+10*a[2]+a[3];
		int z=10000*a[0]+1000*a[1]+100*a[5]+10*a[3]+a[7];
		if((x+y)==z){
			return true;
		}else{
			return false;
		}
	}


}
