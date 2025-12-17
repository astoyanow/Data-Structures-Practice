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
	private int x;
	private int y;
	
	public Node(Node head, Node tail, int value, String name, List<Node> neighbors) {
		this.head = head;
		this.tail = tail;
		this.value = value;
		this.name = name;
		this.neighbors = neighbors;
	}
	
	public Node(int x, int y, int value) {
		this.x = x;
		this.y = y;
		this.value = value;
	}
	
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
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
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
