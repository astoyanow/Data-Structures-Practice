package node;
import java.util.List;

/**
 * Node class to be used as representative data structure in the different data structure functions.
 * 
 * 
 */

public class Node {
	private Node head;
	private Node tail;
	private int value;
	private String name;
	private List<Node> neighbors;
	
	public Node() {
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public List<Node> getNeighbors() {
		return this.neighbors;
	}
	
	public void setNeighbors(List<Node> neighbors) {
		this.neighbors = neighbors;
	}
	
	public boolean hasNeighbors() {
		return this.neighbors.size() > 0;
	}
	
	/**
	 * Representation of Nodes in a LinkedList
	 * 
	 */
	
	public Node getHead() {
		return this.head;
	}
	
	public void setHead(Node node) {
		this.head = node;
	}
	
	public Node getTail() {
		return this.tail;
	}
	
	public void setTail(Node node) {
		this.tail = node;
	}
	
	public boolean hasTail() {
		return this.tail != null;
	}
	
	public boolean hasHead() {
		return this.head != null;
	}
	
}
