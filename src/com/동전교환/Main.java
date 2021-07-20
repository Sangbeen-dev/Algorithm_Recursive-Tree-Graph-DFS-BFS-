package com.동전교환;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int answer=Integer.MAX_VALUE, n, m;
	public void DFS(int L, int sum, Integer[] arr) {
		if(sum>m) return;
		if(L>=answer) return;
		if(sum==m) answer=Math.min(answer, L);
		else {
			for(int i=0; i<n; i++) {
				DFS(L+1,sum+arr[i],arr);
			}
		}
	}
	
	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		Integer[] arr = new Integer[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		m = kb.nextInt();
		t.DFS(0,0,arr);
		System.out.println(answer);
	}
}
