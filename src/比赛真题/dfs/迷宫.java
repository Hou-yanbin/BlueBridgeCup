package 比赛真题.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 迷宫 {
	public static int n=30,m=50;
	public static char c[][]=new char[n][m];
	public static boolean buf[][]=new boolean[n][m];
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> ans=new ArrayList<String>();//用于存储路径的序列
		for (int i = 0; i < n; i++) {
			c[i]=scanner.next().toCharArray();//将输入的数字变成迷宫c
			
		}
		Queue<Node> que=new LinkedList<Node>();//队列
		//que.add(new Node(0,0,""));
		
		
		
		
		
		
	}
	class Node{//点的状态 
		int x;
		int y;
		String s;//到达当当前位置的路径，以字符串显示 
		Node(int xx,int yy,String ss){//初始化
		
			x=xx;
			y=yy;
			s=ss;
		}
	}

}
