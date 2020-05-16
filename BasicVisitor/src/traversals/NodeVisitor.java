package traversals;

import node.Node.AddNode;
import node.Node.IntNode;
import node.Node.MulNode;
import node.Node.NegNode;

public interface NodeVisitor<T> {

	T addNode(AddNode addNode);

	T intNode(IntNode intNode);

	T negNode(NegNode negNode);

	T mulNode(MulNode mulNode);

}
