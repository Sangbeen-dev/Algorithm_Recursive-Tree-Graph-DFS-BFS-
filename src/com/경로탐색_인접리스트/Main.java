package com.경로탐색_인접리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int n, m, answer =0;
	static int[] ch;
	static ArrayList<ArrayList<Integer>> graph;
	public void DFS(int v) {
		if(v==n) answer ++;
		else {
			for(int nv:graph.get(v)) {
				if(ch[nv]==0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch=new int[n+1];
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		ch[1]=1;
		t.DFS(1);
		System.out.println(answer);
	}
}
