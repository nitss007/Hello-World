package helloworld;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {

	private static List<Integer>[] adj ;

	public static void main(String[] args) {
		//System.out.println("sgsgsd");
		AdjacencyLists(3);
		for (int i = 1; i < 2; i++) {
			addEdge(i,i);
		}
		print();
	}

	private static void print() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(!adj[i].isEmpty()) System.out.print(adj[i].get(j));
				else System.out.print(0);
			}
			System.out.println();
		}
	}

	private static void addEdge(int i, int j) {
		adj[i].add(j);
	}

	@SuppressWarnings("unchecked")
	private static void AdjacencyLists(int i) {

		adj = (List<Integer>[])new List[i];
		for (int j = 0; j < i; j++) {
			adj[j] = new ArrayList<Integer>();
			for (int count = 0; count < 3; count++) {
				if(count ==j)
				addEdge(j,j);
				else addEdge(j, 0);
		}
	}
	}
}
	
	

