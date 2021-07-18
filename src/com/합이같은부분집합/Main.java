package com.합이같은부분집합;

import java.util.Scanner;

public class Main {
	static String answer = "NO";
	static int n, total;
	boolean flag=false;
	public void DFS(int L, int sum, int[] arr) {
		if(flag) return;
		if(sum>total/2) return;
		if(L==n) {
			if(sum==total-sum) {
				answer = "YES";
				flag = true;
			}
		}else {
			DFS(L+1,sum+arr[L],arr);
			DFS(L+1,sum,arr);
		}
	}
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		t.DFS(0,0,arr);
		System.out.println(answer);
	}
}
