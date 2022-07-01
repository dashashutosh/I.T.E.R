package Strings_N_Things;

public class Soundex {

	public static final char[] MAP = {
			//A	  B		C		D		E		F		G		H		I		J		K		L		M
			  '0',	 '1', 	'2',	'3',	'0',	'1',	'2',	'0',	'0',	'2',	'2',	'4',	'5',
			  
			//N	  O		P		Q		R		S		T		U		V		W		X		Y		Z
			  '5',	  '0',		'1',	'2',	'6',	'2',	'3',	'0',	'1',	'0',	'2',	'0',	'2'
	};
	
	private static final Soundex Soundex=null;
	
	public static String soundex(String s) {
		
		String t=s.toUpperCase();
		StringBuffer res=new StringBuffer();
		char c,prev='?';
		
		for(int i=0;i<t.length() && res.length() <4 && (c=t.charAt(i))!=',';i++) {
			
			if(c>='A'&&c<='Z'&&c!=prev) {
				prev=c;
				if(i==0)
					res.append(c);
				else {
					char m=MAP[c-'A'];
					if(m!='0')
						res.append(m);
				}
				
			}
			
		}
		
		if(res.length()==0)
			return null;
		for(int i=res.length();i<4;i++)
			res.append('0');
		return res.toString();
	
	}
	
	public static void main(String[] args) {
		
		String[] names= {
				"Darwin, Ian",
				"Davidson, Greg",
				"Darwent, William",
				"Stefan, Doraemon"
		};
		
		for(int i=0;i<names.length;i++)
			System.out.println(Soundex.soundex(names[i])+':'+ names[i]);
	
	}

}
