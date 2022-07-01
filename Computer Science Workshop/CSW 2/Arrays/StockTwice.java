package Chapter_06;

import java.util.Scanner;

public class StockTwice {
	
	static int temp[];
	
	public static void maxProfit(int arr[],int day) {
		
		temp=new int[day];
		
		int min_soFar=arr[0],maxP1=0;
		for(int i=0;i<day;i++){
			min_soFar=Math.min(min_soFar,arr[i]);
			maxP1=Math.max(maxP1,arr[i]-min_soFar);
			temp[i]=maxP1;	
		}
		
		int max_soFar=arr[day-1],maxP2=maxP1,j=day-2;
		for(int i=day-1;i>0;i--){
			max_soFar=Math.max(max_soFar,arr[i]);
			maxP2=Math.max(maxP2, max_soFar-arr[i]+temp[j]);
			j--;	
		}
			
		System.out.println("Maximum profit is "+maxP2+"$");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of days:");
		int day=sc.nextInt();
	
		System.out.println("Enter the prices for the stock:");
		int arr[]=new int[day];
		for(int i=0;i<day;i++) {
			arr[i]=sc.nextInt();
		}
		
		maxProfit(arr, day);

	}

}
