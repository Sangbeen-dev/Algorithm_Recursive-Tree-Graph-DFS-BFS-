package com.팩토리얼;

import java.util.Scanner;

public class Main {
	private int DFS(int n) {
		int answer = 0;
		if(n==1)answer=n;
		else {
			return n*DFS(n-1);
		}
		return answer;
	}

	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(t.DFS(n));
		kb.close();
	}
}
