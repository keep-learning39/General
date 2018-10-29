package GeeksForGeeks;

import java.util.Scanner;

/**
 * Created by puranisu on 4/22/2016.
 */
public class SumTwoNumbers
{

    public static void main(String[] args)
    {
        LinkedList num1 = new LinkedList();
        num1.input();
        System.out.println("\n");
        //num1.display();

        LinkedList num2 = new LinkedList();
        num2.input();
        System.out.println("\n");
        //num2.display();

        add(num1 , num2);

    }
    public static void add(LinkedList num1 , LinkedList num2 )
    {
        Node digit1 = num1.root;
        Node digit2 = num2.root;

        Node digit3= null ;
        Node node , root  = null;

        int carry = 0 , sumDigit = 0;

        while (digit1!=null && digit2 != null)
        {
            sumDigit = (digit1.value + digit2.value + carry)%10;
            carry = (digit1.value + digit2.value + carry)/10;
            node  = new Node(sumDigit);

            node.Next = digit3;
            digit3 = node;

            digit1 = digit1.Next;
            digit2 = digit2.Next;
        }
        while (digit2!=null )
        {
            sumDigit = (digit2.value +carry)%10;
            carry = (digit2.value +carry)/10;

            node  = new Node(sumDigit);
            node.Next = digit3;
            digit3 = node;
            digit2 = digit2.Next;
        }
        while (digit1!=null )
        {
            sumDigit = (digit1.value +carry)%10 ;
            carry = (digit1.value +carry)/10;
            node  = new Node(sumDigit);
            node.Next = digit3;
            digit3 = node;
            digit1 = digit1.Next;
        }
        LinkedList sum = (new LinkedList());
        sum.root = digit3;
        System.out.print("SUM : ");
        sum.display();

    }

    public  static  class LinkedList
    {
        Node root;
        LinkedList()
        {
            root = new Node(0);
        }

        void input()
        {
            Scanner scanner = new Scanner(System.in);
            String str;
            str = scanner.next();
            int i = 0 ;

            Node prev =null, current ;

            while ( i < str.length() )
            {
                current = new Node(str.charAt(i)-'0');
                current.Next = prev;
                prev = current;
                i++;
            }

            root = prev;
        }
        void display()
        {
            Node node = root;
            while (node != null)
            {
                System.out.print(node.value);
                node = node.Next;
            }
        }
    }
    public  static  class Node
    {
        int value;
        Node Next;

        Node( int value )
        {
            this.value = value;
            this.Next = null;
        }

        Node()
        {
            this.Next = null;
        }
    }

}
