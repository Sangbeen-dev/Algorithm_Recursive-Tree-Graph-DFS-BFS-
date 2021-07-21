package com.섬나라아일랜드_DFS;

import java.util.Scanner;

public class Main {
	static int answer=0, n;
	static int[][] arr;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	public void DFS(int x, int y, int[][] arr) {
		for (int i = 0; i < 8; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]==1) {
				arr[nx][ny]=0;
				DFS(nx, ny, arr);
			}
		}
	}
	
	public void solution(int[][] arr) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(arr[i][j]==1) {
					answer++;
					arr[i][j]=0;
					DFS(i, j, arr);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		t.solution(arr);
		System.out.println(answer);
	}
}
