package com.이진트리순회_깊이우선탐색;

import java.util.Scanner;

public class Main {
	static int[] fibo;
	private int DFS(int n) {
		if(fibo[n]>0) return fibo[n];
		if(n==1) return fibo[n]=1;
		else if(n==2) return fibo[n]=1;
		else return fibo[n]=DFS(n-2)+DFS(n-1);
	}

	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		fibo=new int[n+1];
		t.DFS(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i]+" ");
		}
		kb.close();
	}
}
