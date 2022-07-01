package Chapter_06;

import java.util.Scanner;

public class StockOnce {
	
	public static void maxProfit(int arr[],int day) {
		
		int min=arr[0],max;
		for(int i=0;i<day;i++){
			min=Math.min(min,arr[i]);
			max=arr[i]-min;
			arr[i]=max;
		}
		
		int maxP=arr[0],d=0;
		for(int i=0;i<day-1;i++){
			if(maxP<=arr[i+1]){
				maxP=arr[i+1];
				d=i+1;
			}	
		}
			
		System.out.println("Maximum profit is "+maxP+"$ at day "+(d+1));
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
