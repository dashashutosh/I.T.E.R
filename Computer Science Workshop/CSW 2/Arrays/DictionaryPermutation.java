package Chapter_06;

import java.util.Scanner;

public class DictionaryPermutation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		
		int a[]=new int[size];

		System.out.println("enter the elements to the array:");
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();
		
		int j=size-2;
		for(int i=size-1;i>=0;i--){
			if(a[i]>a[j]){
				for(int k=size-1;k>j;k--){
					if(a[j]<a[k]){
						int temp=a[j];
						a[j]=a[k];
						a[k]=temp;
						break;
					}
				}
				break;
			}
			else if(j==1)
				break;
			j--;
				
		}
		for(int k=j+1;k<size;k++) {
			for(int l=k+1;l<size;l++) {
				if(a[k]>a[l]) {
					int s=a[k];
					a[k]=a[l];
					a[l]=s;
				}
			}
		}
		
		System.out.println("Dictionary ordered next Permutation is:");
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
	}

}
