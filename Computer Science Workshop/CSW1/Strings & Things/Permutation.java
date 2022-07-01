package Strings_N_Things;

public class Permutation {

	public static void main(String[] args) {
		
		String str="123";
		int n=str.length();
		Permutation p=new Permutation();
		p.permute(str,0,n-1);
		
	}
	
	public void permute(String str,int l,int r) {
		
		if(l==r)
			System.out.println(str);
		else {
			for(int i=l;i<=r;i++) {
				str=swap(str,l,i);
				permute(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}
	
	public String swap(String a,int i,int j) {
		
		char temp;
		char[] charArray=a.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
		
	}

}
