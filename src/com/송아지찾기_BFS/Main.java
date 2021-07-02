package com.송아지찾기_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	int[] dis = {1,-1,5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS(int s, int e) {
		ch= new int[10001];
		ch[s] = 1;
		Q.offer(s);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				int x = Q.poll();
				if(x==e) return L;
				for(int j=0; j<3; j++) {
					int nx = dis[j]+x;
					if(nx>0 && nx<100001 && ch[nx]==0) {
						ch[nx]=1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}
	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		System.out.println(t.BFS(s,e));
		kb.close();
	}
}
