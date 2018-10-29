import java.util.Scanner;

/**
 * Created by puranisu on 4/21/2016.
 */
public class LinkedList
{
    static Node root;
    LinkedList()
    {
        root = null;
    }
    static class Node
    {
        int value;
        Node Next;

        Node( int value)
        {
            this.value = value;
            this.Next = null;
        }

        Node( )
        {
            this.Next = null;
        }
    }


    public static void main(String[] args)
    {
        Node root = new Node() , prev , currentNode  ;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        prev = root;
        while (num != -1)
        {
            currentNode = new Node(num);
            prev.Next = currentNode;
            prev = currentNode;
            num = scanner.nextInt();
        }

        currentNode = root.Next;

        while (currentNode!=null)
        {
            System.out.println(currentNode.value);
            currentNode = currentNode.Next;
        }
    }
}
