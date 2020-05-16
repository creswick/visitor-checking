package node;

import traversals.NodeVisitor;

public abstract class Node { 
	private Node() {}
	public abstract <T> T visit(NodeVisitor<T> v);	
	
	public final static class IntNode extends Node {
	    public final int value;
	    
	    IntNode(int v) { value = v; }

		@Override
		public <T> T visit(NodeVisitor<T> v) {
			return v.intNode(this);
		}
	}

	public final static class NegNode extends Node { 
	    public final Node node;
	    
	    NegNode(Node n) { node = n; }

		@Override
		public <T> T visit(NodeVisitor<T> v) {
			return v.negNode(this);
		}
	}
	
	public final static class MulNode extends Node {
	    public final Node left, right;
	    
	    MulNode(Node l, Node r) { left = l; right = l; }

		@Override
		public <T> T visit(NodeVisitor<T> v) {
			return v.mulNode(this);
		}
	}

	public final static class AddNode extends Node {
		public final Node left, right;
	    
	    AddNode(Node l, Node r) { left = l; right = l; }

		@Override
		public <T> T visit(NodeVisitor<T> v) {
			return v.addNode(this);
		}
	}


}

