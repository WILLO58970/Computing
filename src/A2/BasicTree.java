package A2;

public class BasicTree
{
    public static void main(String[] args)
    {

        Node root = new Node("Vertebrates");

        Node reptiles = new Node("Reptiles");
        reptiles.addEdge(new Node("Snake"));
        reptiles.addEdge(new Node("Crocodile"));
        root.addEdge(reptiles);

        Node amphibians = new Node("Amphibians");
        amphibians.addEdge(new Node("Frog"));
        amphibians.addEdge(new Node("Newt"));
        root.addEdge(amphibians);

        Node fish = new Node("Fish");
        fish.addEdge(new Node("Shark"));
        fish.addEdge(new Node("Tuna"));
        root.addEdge(fish);

        Node birds = new Node("Birds");
        birds.addEdge(new Node("Wren"));
        birds.addEdge(new Node("Swan"));
        root.addEdge(birds);

        Node mammals = new Node("Mammals");
        mammals.addEdge(new Node("Cow"));
        mammals.addEdge(new Node("Human"));
        root.addEdge(mammals);

        System.out.println("--> " + root.getValue() + " (root)");        
        for (Node child : root.getEdges())
        {
            System.out.println("------> " + child.getValue());
            for (Node grandchild : child.getEdges())       
            {
                System.out.println("----------> " + grandchild.getValue());
            }
        }

    }
}