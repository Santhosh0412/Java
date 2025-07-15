package DSA;
import java.util.Scanner;
class Node {
    int id;
    String name;
    Node next;
    Node(int id, String name, Node next) {
        this.id = id;
        this.name = name;
        this.next = next;
    }
}
public class List {
    static Node Head = null;
    public static void main(String[] args) {
        ListCreate();
        displayList();
    }
    static void ListCreate() {
        int NoNode;
        String StudName = "hicet";
        Node newNode, temp = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        NoNode = sc.nextInt();
        for (int i = 0; i < NoNode; i++) {
            newNode = new Node((i + 1)  * 10, StudName, null);  
            if (Head == null) {
                Head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
    }
    static void displayList() {
        Node temp = Head;
        System.out.println("List content:"); 
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name);
            temp = temp.next;
        }
    }
}
