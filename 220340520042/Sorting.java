//Que-01
import java.util.Scanner;
class Sorting{
	void insertionSort(int array[]){
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			int k=array[i];
			int j=i-1;
			while(j>=0 && array[j]>k)
			{
				array[j+1]=array[j];
				j=j-1;
				for(int l=0;l<n;l++)
				{
					System.out.print(array[l]+" ");
				}System.out.println(" ");
			}array[j+1]=k;
		}
	}
	
	public static void main(String [] args){
		Sorting s1=new Sorting();
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int  a1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}
		s1.insertionSort(a1);
	}
} 