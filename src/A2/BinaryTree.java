package A2;

public class BinaryTree
{
    private static BinaryNode root = null;

    public static void addNode(String value)
    {
        BinaryNode newNode = new BinaryNode(value);

        if (root == null)
        {
            root = newNode;            
        }
        else
        {
            BinaryNode parentCandidate = root;
            while (true)
            {
                if (newNode.getValue().compareTo(parentCandidate.getValue()) < 0)
                {
                    if (parentCandidate.getLeftChild() == null)
                    {
                        parentCandidate.setLeftChild(newNode);
                        break;
                    }
                    else
                    {
                        parentCandidate = parentCandidate.getLeftChild();
                    }
                }
                else
                {
                    if (parentCandidate.getRightChild() == null)
                    {
                        parentCandidate.setRightChild(newNode);
                        break;
                    }
                    else
                    {
                        parentCandidate = parentCandidate.getRightChild();        
                    }
                }            
            }
        } 	

    }

    public static void main(String[] args)
    {
        addNode("Pear");
        addNode("Grape");
        addNode("Pineapple");
        addNode("Lemon");
        addNode("Grapefruit");
        addNode("Lime");
        addNode("Apple");
        addNode("Strawberry");
        addNode("Raspberry");
        addNode("Melon");
        addNode("Kiwi");
        addNode("Blueberry");
        addNode("Blackcurrant");
        addNode("Banana");

        BinaryNode.printAll(root);

    }
}