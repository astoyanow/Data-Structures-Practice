package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

import node.Node;

public class Data {
	
	// Data will represent graphs in the form of an adjacency matrix and will use Node objects as the objects found at each point.
	
	public Data() {
		
	}
	
	public Node[][] createEmptyAdjacencyMatrix(int size) {
		Node[][] adjMatrix = new Node[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				adjMatrix[i][j] = new Node(i, j, 0);
			}
		}
		return adjMatrix;
	}
	
	
	
	public Node[][] createUndirectedGraph(int size, double p) {
		Node[][] graph = createEmptyAdjacencyMatrix(size);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					graph[i][j].setValue(0);
				} else {
					double pScore = RandomGenerator.getDefault().nextDouble();
					if (pScore < p) {
						graph[i][j].setValue(1);
					} else {
						graph[i][j].setValue(0);
					}
				}

			}
		}
		return graph;
	}
	
	

}
