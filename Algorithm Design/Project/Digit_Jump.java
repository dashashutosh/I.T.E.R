package AD1;

import java.util.*;

public class Digit_Jump 
{
	static ArrayList<ArrayList<Integer>> edges;
	static int len;
	static boolean visit[];
	static long dist[];
	
	//Using BFS algorithm to implement the program
	public static void BFSjump(int src,String s)
	{
		LinkedList<Integer> q=new LinkedList<Integer>();
		
		q.addLast(src);
		
		visit[src]=true;
		
		while(!q.isEmpty()) 
		{	
			int rem = q.removeFirst();
			
			if(rem == len-1)
				break;
			
			for(int c : edges.get(s.charAt(rem)-'0')) 
			{	
				if(visit[c])
					continue;
				
				visit[c] = true;
				dist[c] = dist[rem] + 1;
				q.addLast(c);
			}
			
			edges.get(s.charAt(rem)-'0').clear();
			
			if(rem>=1 && !visit[rem-1]) 
			{	
				visit[rem-1] = true;
				dist[rem-1] = dist[rem]+1;
				q.addLast(rem-1);
			}

			if(rem < len-1 && !visit[rem+1])
			{	
				q.addLast(rem+1);
				visit[rem+1] = true;
				dist[rem+1] = dist[rem] + 1;
			}	
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//User Input for digits in string format
		System.out.println("Enter a string (sequence of digits): ");
		String s = sc.next();
		
		edges = new ArrayList<ArrayList<Integer>>();
		
		len = s.length();
		
		//visit ensures that a particular digit or index is visited or not, displaying in boolean form
		visit = new boolean[len+1];
		
		//distance is the count for the no.of jumps from one index to other
		dist = new long[len+1];
		
		//ArrayList edges is assigned from all the digits from 0 to 9
		for(int i=0; i<=9; i++)
			edges.add(new ArrayList<Integer>());
		
		//edges gets all the values or digits entered by the user
		for(int i=0; i<s.length(); i++) 
		{	
			int ch = s.charAt(i) - '0';
			edges.get(ch).add(i);	
		}
		
		//calling the BFS function to count no. of jumps needed to reach the end position
		BFSjump(0,s);
		
		System.out.println("\nMinimum no.of jumps needed to reach the last digit:\n"+dist[len-1]);	
		sc.close();
	}
	
}
