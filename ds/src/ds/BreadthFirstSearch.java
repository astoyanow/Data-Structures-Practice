package ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import node.Node;

public class BreadthFirstSearch {
	
	public BreadthFirstSearch() {
		
	}
	
	public List<Node> search(Node start, String target) {
		ArrayList<String> seen = new ArrayList<>();
		List<Node> neighbors = start.getNeighbors();
		int numNeighbors = neighbors.size();
		if (numNeighbors == 0) {
			return new ArrayList<Node>(Arrays.asList(start));
		}
		for (int i = 0; i < numNeighbors; i ++) {
			if (numNeighbors = 0) {
				
			}
		}
		
	}
	
	public List<Node> subsearch(Node node, ArrayList<String> seen) {
		List<Node> 
	}
