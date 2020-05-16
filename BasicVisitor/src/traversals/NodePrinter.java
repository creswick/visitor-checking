package traversals;

import node.Node.AddNode;
import node.Node.IntNode;
import node.Node.MulNode;
import node.Node.NegNode;

public class NodePrinter implements NodeVisitor<String> {

	@Override
	public String addNode(AddNode addNode) {
		return addNode.left.visit(this) + " + " + addNode.right.visit(this);
	}

	@Override
	public String intNode(IntNode intNode) {
		return ""+intNode.value;
	}

	@Override
	public String negNode(NegNode negNode) {
		return "-" + negNode.node.visit(this);
	}

	@Override
	public String mulNode(MulNode node) {
		return node.left.visit(this) + " * " + node.right.visit(this);
	}

	
}
