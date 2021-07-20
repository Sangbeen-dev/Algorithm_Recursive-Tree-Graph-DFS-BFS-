package com.조합수구하기_메모제이션;

import java.util.Scanner;

public class Main {
	static int n, r;
	int[][] ch = new int[35][35];
	public int DFS(int n, int r) {
		if(ch[n][r]>0) return ch[n][r];
		if(n==r || r==0) return 1;
		else return ch[n][r] = DFS(n-1,r-1) + DFS(n-1, r);
	}
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		r = kb.nextInt();
		System.out.println(t.DFS(n, r));
	}
}
