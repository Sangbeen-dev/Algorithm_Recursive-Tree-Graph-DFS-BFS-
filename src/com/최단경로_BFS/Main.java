package com.최단경로_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n, m;
	static int[] ch, dis;
	static ArrayList<ArrayList<Integer>> graph;
	public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>();
		ch[v]=1;
		dis[v]=0;
		Q.offer(v);
		while(!Q.isEmpty()) {
			int cv = Q.poll();
			for(int nv:graph.get(cv)) {
				if(ch[nv]==0) {
					ch[nv]=1;
					Q.offer(nv);
					dis[nv]=dis[cv]+1;
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
		dis=new int[n+1];
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		t.BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i+" : "+dis[i]);
		}
	}
}
