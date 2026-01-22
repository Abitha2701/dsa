import java.util.*;

public class Main
{
	static class Node {
		int data;
		Node next;

		Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
		Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node convertarr2ll(int arr[]) {
		Node head=new Node(arr[0]);
		Node mover=head;
		for(int i=1; i<arr.length; i++) {
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
		}
		return head;

	}
	public static void traversal(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("none");
	}
	public static Node insertionAtbeg(int data,Node head) {
		Node temp=new Node(data,head);
		// temp.next=head;
		// head=temp;
		// while(head.next!=null){
		//     System.out.print(head.data+"->");
		//     head=head.next;
		// }
		return temp;
	}
	public static Node insertAtend(int data,Node head) {
		Node newNode=new Node(data);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		return head;
	}
	public static Node insertAtpos(int data,Node head,int pos) {
		Node temp=head;
		for(int i=1; i<pos-1; i++) {
			temp=temp.next;
		}
		Node newNode=new Node(data,temp.next);
		temp.next=newNode;

		return head;
	}
	public static Node insertAfterNode(int data,Node head,int value) {
		Node temp=head;
		while(temp.data!=value) {
			temp=temp.next;
		}
		Node last=temp.next;
		Node newNode=new Node(data);
		temp.next=newNode;
		newNode.next=last;
		return head;

	}
	public static Node insertBeforeNode(int data,Node head,int value){
	    Node temp=head;
	    while(temp.next.data!=value){
	        temp=temp.next;
	    }
	    Node last=temp.next;
	    Node newNode=new Node(data);
	    temp.next=newNode;
	    newNode.next=last;
	    return head;
	    
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Node head=convertarr2ll(arr);

		traversal(head);
		System.out.println();
		Node begInsert=insertionAtbeg(5,head);
		traversal(begInsert);
		System.out.println();
		Node endInsert=insertAtend(6,head);
		traversal(endInsert);
		System.out.println();
		Node posInsert=insertAtpos(7,head,3);
		traversal(posInsert);
		System.out.println();
		Node insertAfterdata=insertAfterNode(8,head,4);
		traversal(insertAfterdata);
		Node insertBeforedata=insertBeforedata
	}
}
