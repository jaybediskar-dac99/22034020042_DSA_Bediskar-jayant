//Q-2-Reverse Linked list
import java.util.Scanner;
class LList{
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	void insert(int x){
		Node new_node=new Node(x);
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new_node;
			
		}
	}
	
	Node reverse(Node node){
		Node prev=null;
		Node curr=node;
		Node next=null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		node=prev;
		return node;
	}
	
	void display(Node node){
		while(node!=null){
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}
	
	public static void main(String [] args){
		LList l1=new LList();
		Scanner sc=new Scanner(System.in);
		int testcase1=sc.nextInt();
		 for(int i=0;i<testcase1;i++)
		{
			int n=sc.nextInt();
			for(int j=0;j<n;j++)
			{
				int a=sc.nextInt();
				l1.insert(a);
			}
			head=l1.reverse(head);
			System.out.println("Test Case:");
			l1.display(head);
		}
	}
}