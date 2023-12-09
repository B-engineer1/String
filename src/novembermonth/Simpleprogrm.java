package novembermonth;

public class Simpleprogrm {

	public static void main(String[] args) {
		
		String str = "Abhishek";
		String rev = "";
		
	// 1st Approach	
		
	//	StringBuffer st = new StringBuffer(str);
	//	System.out.println(st.reverse());
		
		
	// 2nd Approach
		
	for(int i=str.length()-1; i>=0; i--)
	{
	    rev= rev+str.charAt(i);	
	}
	System.out.println(rev);

	}

}
