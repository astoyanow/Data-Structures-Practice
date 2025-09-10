package ds;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import node.Node;

public class Searches {
	
	public List<String> breadthFirstSearch(Node start) {
		Queue<Node> queue = new ArrayDeque<>();
		ArrayList<String> output = new ArrayList<>();
		ArrayList<String> visited = new ArrayList<>();
		String startName = start.getName();
		if (!start.hasNeighbors()) {
			return new ArrayList<String>(Arrays.asList(startName));
		}
		queue.add(start);
		visited.add(startName);
		output.add(startName);
		while (!queue.isEmpty()) {
			Node next = queue.poll();
			output.add(next.getName());
			if (next.hasNeighbors()) {
				for (int i = 0; i < next.getNeighbors().size()-1; i++) {
					Node neighbor = next.getNeighbors().get(i);
					if (!visited.contains(neighbor.getName())) {
						queue.add(neighbor);
						visited.add(neighbor.getName());
					}
				}
			}
		}
		return output;
		
	}
	
	public List<String> depthFirstSearch(Node node, ArrayList<String> visited) {
		List<String> output = new ArrayList<>();
		String name = node.getName();
		if (!node.hasNeighbors()) {
			return new ArrayList<String>(Arrays.asList(name));
		}
		visited.add(name);
		output.add(name);
		List<Node> neighbors = node.getNeighbors();
		for (int i = 0; i < neighbors.size()-1; i++) {
			if (!visited.contains(node.getName())) {
				output.addAll(depthFirstSearch(neighbors.get(i), visited));
			}
		}
		return output;
	}
}

