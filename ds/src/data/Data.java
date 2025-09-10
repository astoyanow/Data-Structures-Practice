package data;

import java.util.ArrayList;
import java.util.Arrays;

import node.Node;

public class Data {
	
	public static ArrayList<Node> createSimpleGraph() {
		Node a = new Node();
		Node b = new Node();
		Node c = new Node();
		Node d = new Node();
		a.setNeighbors(new ArrayList<Node>(Arrays.asList(a, b ,c)));
	}

}
