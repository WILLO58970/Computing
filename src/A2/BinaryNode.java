package A2;

import java.util.ArrayDeque;

public class BinaryNode {

    private String value;
    private BinaryNode parent;
    private BinaryNode leftChild;
    private BinaryNode rightChild;

    public BinaryNode(String setValue) {
        value = setValue;
        parent = null;
        leftChild = null;
        rightChild = null;
    }

    public void setLeftChild(BinaryNode target) {
        leftChild = target;
        target.parent = this;
    }

    public void setRightChild(BinaryNode target) {
        rightChild = target;
        target.parent = this;
    }

    public BinaryNode getLeftChild() {
        return leftChild;
    }

    public BinaryNode getRightChild() {
        return rightChild;
    }

    public BinaryNode getParent() {
        return parent;
    }  

    public String getValue() {
        return value;
    }       

    public static void printAll(BinaryNode root)
    {
        StringBuilder output = new StringBuilder();

        ArrayDeque<BinaryNode> stack = new ArrayDeque<>();
        BinaryNode node = root;        

        while (node != null) {
            stack.push(node);
            node = node.getLeftChild();
        }

        while (stack.size() > 0) 
        {

            node = stack.pop();
            String line = "";
            for (BinaryNode parent = node.getParent(); parent != null; parent = parent.getParent())
            {
                line += "--- ";
            }
            line += "> " + node.getValue() + "\n";           

            output.insert(0, line);

            if (node.getRightChild() != null) 
            {
                node = node.getRightChild();
                while (node != null) 
                {
                    stack.push(node);
                    node = node.getLeftChild();
                }
            }

        }

        System.out.println(output);

    }

}

