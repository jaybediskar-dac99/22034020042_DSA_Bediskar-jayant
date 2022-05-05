//Quetion - 03

public class Stack{
	int []a;
	int size;
	int top1,top2;
	
	Stack(int n){
		size=n;
		a=new int[n];
		top1=n/2+1;
		top2=n/2;
	}
	
	void push1(int x){
		if(top1>1)
		{
			top1--;
			a[top1]=x;
		}
		else
		{
			System.out.println("OverfLow with member !!"+ x);
			return;
		}
	}
	
	void push2(int x){
		if(top2<size-1)
		{
			top2++;
			a[top2]=x;
		}
		else{
			System.out.println("OverfLow with member !!"+ x);
		}
	}
	
	int pop1(){
		if(top1<=size/2)
		{
			int x=a[top1];
			top1++;
			return x;
		}
		else
		{
			System.out.println("Underflow!!");
			return 1;
		}
	}
	
	int pop2(){
		if(top2>=size/2+1)
		{
			int x=a[top2];
			top2--;
			return x;
		}
		else{
			System.out.println("Underflow!!");
			return 1;
		}
	}
	
	
	public static void main(String [] args){
		Stack s1=new Stack(10);
		s1.push1(5);
		s1.push2(10);
		s1.push2(15);
		s1.push1(11);
		s1.push2(7);
		s1.push2(40);
		System.out.println("Popped element from stack1 is "+s1.pop1());
		System.out.println("Popped element from stack2 is "+s1.pop2());
	}
}