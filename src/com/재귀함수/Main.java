package com.재귀함수;

public class Main {
	private void DFS(int x) {
		if(x==0) return;
		else {
			DFS(x-1);
			System.out.print(x);
		}
	}

	public static void main(String[] args) {
		Main t = new Main();
		t.DFS(3);
	}
}
