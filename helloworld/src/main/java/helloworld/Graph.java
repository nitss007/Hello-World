package helloworld;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	private int v; // No of vertices
	private LinkedList<Integer> adj[];

	public Graph(int v) {
		super();
		this.v = v;
		this.adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	void addEdge(int i, int j) {
		adj[i].add(j);
	}

	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.BFS(2);
		g.DFS(2);
	}

	private void BFS(int i) {
		boolean[] visited = new boolean[v];
		LinkedList<Integer> queue = new LinkedList<Integer>();

		visited[i] = true;
		queue.add(i);
		while (queue.size() != 0) {
			i = queue.poll();
			System.out.println(i + "visited");

			Iterator<Integer> itr = adj[i].iterator();
			while (itr.hasNext()) {
				int n = itr.next();
				if (!visited[n]) {
					queue.add(n);
					visited[n] = true;
				}

			}

		}

	}

	private void DFS(int i) {
		boolean[] visited = new boolean[v];
		System.out.println("DFS algorithm");
		dfsUtil(i, visited);

	}

	private void dfsUtil(int i, boolean[] visited) {

		visited[i] = true;
		System.out.println(i + "visited");
		Iterator<Integer> itr = adj[i].iterator();
		while (itr.hasNext()) {
			i = itr.next();
			if (!visited[i])
				dfsUtil(i, visited);
		}

	}
}
