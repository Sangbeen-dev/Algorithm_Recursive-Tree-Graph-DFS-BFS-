package com.이진수출력_재귀;

public class Main {
	private void DFS(int n) {
		if(n==0)return;
		else {
			DFS(n/2);
			System.out.print(n%2);
		}
	}

	public static void main(String[] args) {
		Main t = new Main();
		t.DFS(11);
	}
}
